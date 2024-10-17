package com.itschool.library.exceptions;

public class CustomerDeleteException extends RuntimeException {

    public CustomerDeleteException(String message) {
        super(message);
    }
}