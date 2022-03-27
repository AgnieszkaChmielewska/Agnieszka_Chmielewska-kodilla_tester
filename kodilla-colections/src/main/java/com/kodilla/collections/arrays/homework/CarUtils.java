package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("---------------------------");
        System.out.println("Car model: "+getCarModel(car));
        System.out.println("Car speed: "+ car.getSpeed());
    }

    private static String getCarModel(Car car){
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Volvo)
            return "Volvo";
        else return "Unknown model";
    }
}
