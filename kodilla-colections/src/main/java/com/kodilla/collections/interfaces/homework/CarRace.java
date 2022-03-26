package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car carFord = new Ford(100);
        Car carOpel = new Opel(100);
        Car carVolvo = new Volvo(100);
        doRace(carFord);
        doRace(carOpel);
        doRace(carVolvo);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
