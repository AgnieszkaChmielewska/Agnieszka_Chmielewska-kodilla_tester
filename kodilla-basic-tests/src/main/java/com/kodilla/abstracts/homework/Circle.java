package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    static final double PI = 3.1415927;
    private double r;

    public Circle(double r) {
        super(0);
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }
}
