package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDateTime;

public class Cabrio implements Car{

    @Override
    public boolean hasHeadlightsTurnedOn() {

        int hour = LocalDateTime.now().getHour();
        System.out.println(hour);
        if (hour < 6 && hour > 20) {
            return true;
        } else
            return false;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
