package com.kodilla.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertibleTestSuite {
    Convertible convertible = new Convertible(4,3);

    @Test
    public void shouldOpenRoof() {
        convertible.openRoof();
    }

    @Test
    public void shouldCloseRoof() {
        convertible.closeRoof();
    }

    @Test
    public void shouldOpenDoors() {
        convertible.openDoors();
    }

    @Test
    public void shouldReturnNumber() {
        Convertible convertibleOne = new Convertible();
        int seats = convertibleOne.getSeats();
        Assertions.assertEquals(2, seats);
    }
}