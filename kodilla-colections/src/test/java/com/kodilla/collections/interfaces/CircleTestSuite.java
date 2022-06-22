package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTestSuite {
    Circle circle = new Circle(2);

    @Test
    public void shouldReturnArea(){
        double area = circle.getArea();
        Assertions.assertEquals(12.566370614359172, area);
    }

    @Test
    public void shouldReturnPerimeter(){
        double perimeter = circle.getPerimeter();
        Assertions.assertEquals(12.566370614359172, perimeter);
    }

}