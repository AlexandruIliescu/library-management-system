package com.itschool.library.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RequestCustomerDTO {

    private String firstName;
    private String lastName;
    @NotBlank(message = "This field is mandatory")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Email should be valid")
    private String email;
}