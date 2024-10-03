package com.itschool.library.utils.solid;

public class OCP {
}

//Before: violating OCP
class AreaCalculator {
    double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.length * rectangle.width;
        }
        return 0;
    }
}

//After: following OCP
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class TestOCP {
    public static void main(String[] args) {
        Shape circle = new Circle(23.3);
        circle.calculateArea();

        Shape rectangle = new Rectangle(32.5, 26.5);
        rectangle.calculateArea();
    }
}