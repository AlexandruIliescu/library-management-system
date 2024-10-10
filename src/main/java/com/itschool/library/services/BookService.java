package com.itschool.library.services;

import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;

import java.util.List;

public interface BookService {

    ResponseBookDTO createBook(RequestBookDTO requestBookDTO);
    ResponseBookDTO updateBookCopies(Long bookId, int newCopiesAvailable);
    List<ResponseBookDTO> getBooks(String title, String author, String genre);
}