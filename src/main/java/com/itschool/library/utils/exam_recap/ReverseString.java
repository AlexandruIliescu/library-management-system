package com.itschool.library.utils.exam_recap;

import java.util.Scanner;

/*
 * Reverse a String
 * Write a program that takes a string input from the console and prints its reverse.
 */
public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reversed = new StringBuilder(scanner.nextLine()).reverse().toString();
        scanner.close();

        System.out.println("Reversed string: " + reversed);
    }
}