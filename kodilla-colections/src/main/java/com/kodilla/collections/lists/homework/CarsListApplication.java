package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car volvo = new Volvo(200);
        cars.add(volvo);
        cars.add(new Volvo(210));
        cars.add(new Opel(220));
        cars.add(new Ford(240));

        System.out.println("Size of collection: " + cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("---------------------REMOVING--------------------");

        cars.remove(3);
        System.out.println("Size of collection: " + cars.size());

        cars.remove(volvo);
        System.out.println("Size of collection: " + cars.size());

       cars.remove(new Volvo(210));
       /*dlaczego w powyzszym sposobie nie działa usuwanie??*/


        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("Size of collection: " + cars.size());

    }
}
