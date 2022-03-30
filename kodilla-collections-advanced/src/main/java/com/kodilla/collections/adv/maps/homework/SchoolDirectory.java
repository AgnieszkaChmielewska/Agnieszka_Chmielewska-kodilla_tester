package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();
        Principal jan = new Principal("Jan", "Kowalski");
        Principal adam = new Principal("Adam", "Nowak");
        Principal kamil = new Principal("Kamil", "Kowalski");

        School firstSchool = new School("First School", 23, 32, 23, 34, 23);
        School secondSchool = new School("Second School", 32, 12, 34, 12);
        School thirdSchool = new School("Third School", 23, 32, 43, 21, 12);

        schoolMap.put(jan, firstSchool);
        schoolMap.put(adam, secondSchool);
        schoolMap.put(kamil, thirdSchool);

        for (Map.Entry<Principal,School> principalSchoolEntry:schoolMap.entrySet()){
            System.out.println("Principal: "+principalSchoolEntry.getKey()+", School size: "+ principalSchoolEntry.getValue().getSum());
        }
    }

}
