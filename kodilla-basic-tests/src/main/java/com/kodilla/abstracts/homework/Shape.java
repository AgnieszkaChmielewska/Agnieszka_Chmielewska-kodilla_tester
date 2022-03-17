package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int numberOfsides;
    private double area;
    private double circuit;

    public Shape(int numberOfsides) {
        this.numberOfsides = numberOfsides;
    }

    public double getCircuit() {
        return circuit;
    }

    public double getArea() {
        return area;
    }

    public abstract double calculateArea();
}
