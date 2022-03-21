package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int summationResult = calculator.summation(a, b);
        assertEquals(13, summationResult);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtraction(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquare(){
        Calculator calculator = new Calculator();
        int a = 5;
        double squaredResult = calculator.squared(a);
    assertEquals(25, squaredResult, 0.01);
    }
}
