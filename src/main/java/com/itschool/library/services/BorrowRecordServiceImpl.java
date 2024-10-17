package com.itschool.library.services;

import com.itschool.library.exceptions.BookNotFoundException;
import com.itschool.library.exceptions.CustomerNotFoundException;
import com.itschool.library.models.dtos.BorrowRecordDTO;
import com.itschool.library.models.entities.Book;
import com.itschool.library.models.entities.BorrowRecord;
import com.itschool.library.models.entities.Customer;
import com.itschool.library.repositories.BookRepository;
import com.itschool.library.repositories.BorrowRecordRepository;
import com.itschool.library.repositories.CustomerRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class BorrowRecordServiceImpl implements BorrowRecordService {

    private final BookRepository bookRepository;
    private final CustomerRepository customerRepository;
    private final BorrowRecordRepository borrowRecordRepository;

    public BorrowRecordServiceImpl(BookRepository bookRepository,
                                   CustomerRepository customerRepository,
                                   BorrowRecordRepository borrowRecordRepository) {
        this.bookRepository = bookRepository;
        this.customerRepository = customerRepository;
        this.borrowRecordRepository = borrowRecordRepository;
    }

    @Transactional
    @Override
    public void borrowBook(BorrowRecordDTO borrowRecordDTO) {
        Book book = bookRepository.findById(borrowRecordDTO.getBookId())
                .orElseThrow(() -> new BookNotFoundException("Book not found"));

        if (book.getCopiesAvailable() <= 0) {
            throw new IllegalStateException("Not enough books");
        }

        Customer customer = customerRepository.findById(borrowRecordDTO.getCustomerId())
                .orElseThrow(() -> new CustomerNotFoundException("Customer not found"));

        BorrowRecord borrowRecord = new BorrowRecord();
        borrowRecord.setBook(book);
        borrowRecord.setCustomer(customer);
        borrowRecord.setBorrowedAt(LocalDateTime.now());

        book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        bookRepository.save(book);
        log.info("Copies available updated");

        borrowRecordRepository.save(borrowRecord);
        log.info("Borrow record saved");
    }
}