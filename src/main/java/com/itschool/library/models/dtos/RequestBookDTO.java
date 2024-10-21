package com.itschool.library.models.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestBookDTO {

    @NotBlank(message = "This field is mandatory")
    private String title;
    @NotBlank(message = "This field is mandatory")
    private String author;
    private String isbn;
    private String genre;
    @Min(value = 0, message = "Copies available must be at least 0")
    private int copiesAvailable;
}