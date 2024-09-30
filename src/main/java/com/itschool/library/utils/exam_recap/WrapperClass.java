package com.itschool.library.utils.exam_recap;

/*
 * Wrapper Class Example (Convert Integer to String and Vice Versa)
 * Write a program to demonstrate the conversion between Integer (wrapper class) and String.
 */
public class WrapperClass {

    public static void main(String[] args) {
        //Integer to String
        Integer number = 100;
        String numberStr = number.toString();
        System.out.println("Integer to String: " + numberStr);

        //String to Integer
        String str = "200";
        Integer strNumber = Integer.parseInt(str);
        System.out.println("String to Integer: " + strNumber);
    }
}