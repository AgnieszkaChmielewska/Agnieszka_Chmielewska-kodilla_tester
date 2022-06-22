package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordTestSuite {

    Ford ford = new Ford(250);
    Ford fordTwo = new Ford(200);

    @Test
    public void ShouldReturnCarSpeed() {
        int speed = ford.getSpeed();
        Assertions.assertEquals(250, speed);
    }

    @Test
    public void shouldIncreaseCarSpeed() {
        ford.increaseSpeed();
        int speed = ford.getSpeed();
        Assertions.assertEquals(260, speed);
    }

    @Test
    public void shouldDecreaseCarSpeed() {
        fordTwo.decreaseSpeed();
        int speed = fordTwo.getSpeed();
        Assertions.assertEquals(190, speed);
    }

    @Test
    public void shouldReturnFalse() {
        boolean result = ford.equals(fordTwo);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnHashCode() {
        int result = ford.hashCode();
        Assertions.assertEquals(281, result);
    }
}