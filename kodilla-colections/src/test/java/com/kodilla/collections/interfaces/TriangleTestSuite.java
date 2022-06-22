package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestSuite {

    Triangle triangle = new Triangle(2,2,4);

    @Test
    public void shouldReturnArea(){
        double area = triangle.getArea();
        Assertions.assertEquals(2, area);
    }

    @Test
    public void shouldReturnPerimeter(){
        double perimeter = triangle.getPerimeter();
        Assertions.assertEquals(8, perimeter);
    }

}