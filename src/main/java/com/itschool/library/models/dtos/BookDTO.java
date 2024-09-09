package com.itschool.library.models.dtos;

import lombok.Data;

@Data
public class BookDTO {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private String genre;
//    private int copiesAvailable;
}