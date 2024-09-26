package com.itschool.library.utils.design_patterns.factory2;

public class Sedan implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a Sedan car");
    }
}