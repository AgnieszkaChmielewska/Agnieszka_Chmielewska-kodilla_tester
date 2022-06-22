package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpelTestSuite {

    Opel opel = new Opel(250);
    Opel opelTwo = new Opel(200);

    @Test
    public void ShouldReturnCarSpeed() {
        int speed = opel.getSpeed();
        Assertions.assertEquals(250, speed);
    }

    @Test
    public void shouldIncreaseCarSpeed() {
        opel.increaseSpeed();
        int speed = opel.getSpeed();
        Assertions.assertEquals(270, speed);
    }

    @Test
    public void shouldDecreaseCarSpeed() {
        opelTwo.decreaseSpeed();
        int speed = opelTwo.getSpeed();
        Assertions.assertEquals(185, speed);
    }

    @Test
    public void shouldReturnFalse() {
        boolean result = opel.equals(opelTwo);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnHashCode() {
        int result = opel.hashCode();
        Assertions.assertEquals(281, result);
    }
}