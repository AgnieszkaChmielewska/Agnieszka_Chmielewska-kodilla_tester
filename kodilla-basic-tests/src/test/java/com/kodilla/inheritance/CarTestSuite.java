package com.kodilla.inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTestSuite {
    Car car = new Car(4, 5);

    @Test
    public void shouldReturnNumberOfSeats() {
        int numberOfSeats = car.getSeats();
        Assertions.assertEquals(5, numberOfSeats);
    }

    @Test
    public void shouldReturnNumberOfWheels() {
        int numberOfWheels = car.getWheels();
        Assertions.assertEquals(4, numberOfWheels);
    }

    @Test
    public void shouldOpenDoors() {
       car.openDoors();
       }

    @Test
    public void shouldTurnOnLights() {
       car.turnOnLights();
       }

    @Test
    public void shouldDisplayNumberOfSeats() {
       car.displayNumberOfSeats();
       }
}