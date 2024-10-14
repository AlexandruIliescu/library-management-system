package com.itschool.library.exceptions;

public class CustomerDuplicateEmailException extends RuntimeException {

    public CustomerDuplicateEmailException(String message) {
        super(message);
    }
}