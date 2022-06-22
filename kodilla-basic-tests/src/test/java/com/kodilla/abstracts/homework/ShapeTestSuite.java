package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeTestSuite {

    Shape square = new Square(2, 2);
    Shape circle = new Circle(2);
    Shape triangle = new Triangle(3, 2, 3);

    @Test
    public void shouldCalculateTriangleArea() {
        double area = triangle.calculateArea();

        Assertions.assertEquals(2.8284271247461903, area);
    }

    @Test
    public void shouldCalculateTrianglePerimeter() {
        double perimeter = triangle.calculatePerimeter();

        Assertions.assertEquals(8, perimeter);
    }


    @Test
    public void shouldCalculateCircleArea() {
        double area = circle.calculateArea();

        Assertions.assertEquals(12.5663708, area);
    }

    @Test
    public void shouldCalculatePerimeter() {
        double perimeter = circle.calculatePerimeter();

        Assertions.assertEquals(12.5663708, perimeter);
    }


   @Test
    public void shouldCalculateSquareArea() {
        double area = square.calculateArea();

        Assertions.assertEquals(4, area);
    }

    @Test
    public void shouldCalculateSquarePerimeter() {
        double area = square.calculatePerimeter();

        Assertions.assertEquals(8, area);
    }

}