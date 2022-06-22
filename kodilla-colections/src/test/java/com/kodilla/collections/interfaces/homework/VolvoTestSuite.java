package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolvoTestSuite {
    Volvo volvo = new Volvo(250);
    Volvo volvoTwo = new Volvo(200);

    @Test
    public void ShouldReturnCarSpeed() {
        int speed = volvo.getSpeed();
        Assertions.assertEquals(250, speed);
    }

    @Test
    public void shouldIncreaseCarSpeed() {
       volvo.increaseSpeed();
        int speed = volvo.getSpeed();
        Assertions.assertEquals(290, speed);
    }

    @Test
    public void shouldDecreaseCarSpeed() {
       volvoTwo.decreaseSpeed();
        int speed = volvoTwo.getSpeed();
        Assertions.assertEquals(162, speed);
    }

    @Test
    public void shouldReturnFalse() {
       boolean result = volvo.equals(volvoTwo);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnHashCode() {
       int result = volvo.hashCode();
Assertions.assertEquals(281, result);
    }
}