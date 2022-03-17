package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
