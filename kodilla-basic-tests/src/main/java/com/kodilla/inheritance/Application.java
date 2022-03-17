package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(5, 5);
        car.turnOnLights();
        car.openDoors();
        car.getSeats();
        car.displayNumberOfSeats();

        Convertible convertible = new Convertible();
        convertible.turnOnLights();
        convertible.openDoors();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
