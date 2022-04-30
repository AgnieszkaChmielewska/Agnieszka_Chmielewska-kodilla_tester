package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework"); // [1]
    Calculator bean = context.getBean(Calculator.class);

    @Test
    public void shouldReturnCorrectValueOfAdding() {
        double value = bean.add(2, 2);
        assertEquals(4, value);
    }

    @Test
    public void shouldReturnCorrectValueOfSubtraction() {
        double value = bean.subtract(2.6, 5.2);
        assertEquals(-2.6, value);
    }

    @Test
    public void shouldReturnCorrectValueOfMultiply() {
        double value = bean.multiply(0.6, -5.2);
        assertEquals(-3.12, value);
    }

    @Test
    public void shouldReturnCorrectValueOfDivideWhenDivisorNotZero() throws DivideByZeroException {
        double value = bean.divide(1.6, 0.2);
        assertEquals(8, value);
    }

    @Test
    public void shouldThrowExceptionWhenDivisorZero() throws DivideByZeroException {
        assertThrows( DivideByZeroException.class, ()->context.getBean(Calculator.class).divide(1, 0));
    }
}
