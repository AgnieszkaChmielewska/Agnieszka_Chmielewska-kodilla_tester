package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square regularSquare = new Square(5.5, 5.5);
        System.out.println("The area of this shape is: " + regularSquare.calculateArea());
        System.out.println("The perimeter of this shape is: " + regularSquare.calculatePerimeter());
        System.out.println(regularSquare.getNumberOfSides());

        Triangle triangle = new Triangle(8, 5, 5);
        System.out.println(triangle.getNumberOfSides());
        System.out.println("The area of triangle is: " + triangle.calculateArea());
        System.out.println(triangle.getNumberOfSides());

        Circle circle = new Circle(5);
        System.out.println("The area of this shape is: " + circle.calculateArea());
        System.out.println("The perimeter of this shape is: " +circle.calculatePerimeter());
        System.out.println(circle.getNumberOfSides());
    }
}