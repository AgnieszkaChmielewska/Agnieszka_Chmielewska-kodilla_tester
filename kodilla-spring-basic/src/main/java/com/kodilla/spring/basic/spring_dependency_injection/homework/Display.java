package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Display {
    public Object displayNotification;

    public double display(double value){
        System.out.println(value);
        return value;
    }


   public String displayNotification() {
        return "Error";
    }

    @Override
    public String toString() {
        return "Display{}";
    }
}
