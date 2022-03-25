package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(5, 5);
        car.turnOnLights();
        car.openDoors();
        System.out.println(car.getSeats());
        car.displayNumberOfSeats();

        Convertible convertible = new Convertible(8,3);
        convertible.turnOnLights();
        convertible.openDoors();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();

        Convertible convertibleNext = new Convertible();
        convertibleNext.openRoof();
        convertibleNext.closeRoof();
        System.out.println(convertibleNext.getWheels());
        System.out.println(convertibleNext.getSeats());

    }
}
