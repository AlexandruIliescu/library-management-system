package com.itschool.library.utils.design_patterns.factory2;

public class TestCarFactory {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car suv = carFactory.createCar("suv");
        suv.assemble();

        Car hatchback = carFactory.createCar("hatchback");
        hatchback.assemble();
    }
}