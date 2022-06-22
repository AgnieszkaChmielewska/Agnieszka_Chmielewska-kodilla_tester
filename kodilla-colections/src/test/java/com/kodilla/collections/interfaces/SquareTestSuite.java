package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {
    Square square = new Square(2);

    @Test
    public void shouldReturnArea(){
        double area = square.getArea();
        Assertions.assertEquals(4, area);
    }

    @Test
    public void shouldReturnPerimeter(){
        double perimeter = square.getPerimeter();
        Assertions.assertEquals(8, perimeter);
    }
}