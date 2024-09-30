package com.itschool.library.utils.exam_recap;

/*
 * Count Occurrences of Character in String
 * Write a program that takes a string and a character as input
 * and counts how many times that character appears in the string.
 */
public class CharacterCount {

    public static void main(String[] args) {
        String input = "Hello World"; // input.toCharArray = {'H', 'e', 'l', 'l'...}
        char character = 'l';

        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == character) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}