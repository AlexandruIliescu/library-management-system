package com.itschool.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.exceptions.BookNotFoundException;
import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
import com.itschool.library.models.entities.Book;
import com.itschool.library.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private final ObjectMapper objectMapper;
    private final BookRepository bookRepository;

    public BookServiceImpl(ObjectMapper objectMapper, BookRepository bookRepository) {
        this.objectMapper = objectMapper;
        this.bookRepository = bookRepository;
    }

    @Override
    public ResponseBookDTO createBook(RequestBookDTO requestBookDTO) {
        Book bookEntity = objectMapper.convertValue(requestBookDTO, Book.class);
        Book bookEntityResponse = bookRepository.save(bookEntity);
        log.info("Book with id {} was saved", bookEntityResponse.getId());

        return objectMapper.convertValue(bookEntityResponse, ResponseBookDTO.class);
    }

    @Override
    public ResponseBookDTO updateBookCopies(Long bookId, int newCopiesAvailable) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new BookNotFoundException("Book with id " + bookId + " not found"));

        book.setCopiesAvailable(newCopiesAvailable);
        Book updatedBook = bookRepository.save(book);
        log.info("Updated book copies for book id {}", updatedBook.getId());

        return objectMapper.convertValue(updatedBook, ResponseBookDTO.class);
    }

    @Override
    public List<ResponseBookDTO> getBooks(String title, String author, String genre) {
        Specification<Book> spec = Specification
                .where(BookSpecification.titleContains(title))
                .and(BookSpecification.authorContains(author))
                .and(BookSpecification.genreContains(genre));

        List<Book> books = bookRepository.findAll(spec);
        log.info("{} books found", books.size());

        return books.stream()
                .map(book -> objectMapper.convertValue(book, ResponseBookDTO.class))
                .toList();
    }
}