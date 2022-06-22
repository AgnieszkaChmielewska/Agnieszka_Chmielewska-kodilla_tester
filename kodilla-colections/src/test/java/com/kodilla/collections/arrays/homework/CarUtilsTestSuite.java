package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Volvo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

class CarUtilsTestSuite {

    CarsApplication carsApplication = new CarsApplication();
        Car car = new Volvo(240);


    @Test
    public void ShouldDescribeCar() {
        describeCar(car);
        int speed = car.getSpeed();
        Assertions.assertEquals(240, speed);
    }
}
