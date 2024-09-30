package com.itschool.library.utils.exam_recap;

/*
 * Vehicle Movement (Inheritance and Polymorphism)
 * Create a base class Vehicle with a method move().
 * Create subclasses Car and Bike that override the move() method.
 * Demonstrate polymorphism by calling move() on different vehicles.
 */

public class Vehicle {
    public void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}

class TestClass {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.move();
        bike.move();
    }
}