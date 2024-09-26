package com.itschool.library.utils.design_patterns.factory2;

public class Hatchback implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a Hatchback car");
    }
}