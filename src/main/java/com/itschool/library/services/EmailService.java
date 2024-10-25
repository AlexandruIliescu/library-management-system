package com.itschool.library.services;

public interface EmailService {

    void sendEmail(String email, String subject, String body);
}