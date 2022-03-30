package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();
    Principal jan = new Principal("Jan", "Kowalski");
    Principal adam = new Principal("Adam", "Nowak");
    Principal kamil = new Principal("Kamil", "Kowalski");

    School firstSchool = new School("First School", 120);
    School secondSchool = new School("Second School", 220);
    School thirdSchool = new School("Third School", 330);
        schoolMap.put(jan, firstSchool);
        schoolMap.put(adam, secondSchool);
        schoolMap.put(kamil, thirdSchool);
    }

}
