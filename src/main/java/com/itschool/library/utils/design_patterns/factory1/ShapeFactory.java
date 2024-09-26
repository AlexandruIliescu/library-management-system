package com.itschool.library.utils.design_patterns.factory1;

public class ShapeFactory {

    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new IllegalArgumentException("Invalid shape " + shapeType);
        }
    }
}