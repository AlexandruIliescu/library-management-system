package com.itschool.library.models.dtos;

import lombok.Data;

@Data
public class RequestCustomerDTO {

    private String firstName;
    private String lastName;
    private String email;
}