package com.itschool.library.services;

import com.itschool.library.models.dtos.BookDTO;

public interface BookService {

    BookDTO createBook(BookDTO bookDTO);
}