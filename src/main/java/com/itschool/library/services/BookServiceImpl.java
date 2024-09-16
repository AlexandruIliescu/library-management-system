package com.itschool.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;
import com.itschool.library.models.entities.Book;
import com.itschool.library.repositories.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}