package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(5,5);
        car.turnOnLights();

        Convertible convertible = new Convertible();
        convertible.closeRoof();
        convertible.openRoof();
    }
}