package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double sideOne;
    private double sideTwo;

    public Square(double sideOne, double sideTwo)
    {
        super(4);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;

        System.out.println("Square constructor");
    }

    @Override
    public double calculateArea() {
        return sideOne*sideTwo;
    }

    @Override
    public double calculatePerimeter() {
        return 2*sideOne+2*sideTwo;
    }
}
