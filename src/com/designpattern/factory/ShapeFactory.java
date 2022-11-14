package com.designpattern.factory;

public class ShapeFactory {
    public static Shape create(String shape) {
        if ("rectangle".equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if ("square".equalsIgnoreCase(shape)) {
            return new Square();
        } else if ("triangle".equalsIgnoreCase(shape)) {
            return new Triangle();
        } else if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        }
        return null;
    }
}
