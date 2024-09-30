package com.itschool.library.utils.exam_recap;

/*
 * Check Palindrome String
 * Write a program to check if a string is a palindrome (reads the same forward and backward).
 */

public class PalindromeCheck {

    public static void main(String[] args) {
        String input = "Ana";
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("The input is a palindrome");
        } else {
            System.out.println("The input is not a palindrome");
        }
    }
}