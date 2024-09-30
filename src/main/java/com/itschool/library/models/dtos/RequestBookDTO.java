package com.itschool.library.models.dtos;

import lombok.Data;

@Data
public class RequestBookDTO {

    private String title;
    private String author;
    private String isbn;
    private String genre;
//    private int copiesAvailable;
}