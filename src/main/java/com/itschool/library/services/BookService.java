package com.itschool.library.services;

import com.itschool.library.models.dtos.RequestBookDTO;
import com.itschool.library.models.dtos.ResponseBookDTO;

public interface BookService {

    ResponseBookDTO createBook(RequestBookDTO requestBookDTO);
}