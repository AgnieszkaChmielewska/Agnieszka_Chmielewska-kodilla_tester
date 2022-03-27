package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main (String[]args) {
        Random random = new Random();
        Car[]cars = new Car[random.nextInt(20)+1];
        System.out.println("Number of cars: "+cars.length);
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for ( Car car : cars)
           CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        int a = random.nextInt(131) + 1;
        int b = random.nextInt(151) + 1;
        int c = random.nextInt(201) + 1;
        if (drawnCar == 0)
            return new Opel(a);
        else if (drawnCar==1)
            return new Ford(b);
        else
            return new Volvo(c);
    }
}
