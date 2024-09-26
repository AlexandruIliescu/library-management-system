package com.itschool.library.utils.design_patterns.factory2;

public class CarFactory {

    public Car createCar(String carType) {
        return switch (carType.toLowerCase()) {
            case "suv" -> new SUV();
            case "sedan" -> new Sedan();
            case "hatchback" -> new Hatchback();
            default -> throw new IllegalArgumentException("Invalid car type");
        };
    }
}