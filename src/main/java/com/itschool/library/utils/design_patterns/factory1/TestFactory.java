package com.itschool.library.utils.design_patterns.factory1;

public class TestFactory {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape("circle");
        circle.draw();

        Shape triangle = shapeFactory.createShape("triangle");
        triangle.draw();
    }
}