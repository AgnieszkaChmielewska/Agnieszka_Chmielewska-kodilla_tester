package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import org.junit.jupiter.api.Test;

import static com.kodilla.collections.arrays.ShapeUtils.displayShapeInfo;

class ShapeUtilsTestSuite {

    @Test
    public void S() {
    Shape square = new Square(2);
     displayShapeInfo(square);
    }
}