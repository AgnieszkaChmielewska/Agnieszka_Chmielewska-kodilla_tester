package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> pupilsQuantity = new ArrayList<>();

    public School(String schoolName, int...pupilsQuantity) {
        this.schoolName = schoolName;
        for (Integer pupil : pupilsQuantity) {
            this.pupilsQuantity.add(pupil);
        }
    }

    public int getSum(){
        int sum=0;
        for (int classSize : pupilsQuantity) {
sum += classSize;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", pupilsQuantity=" + pupilsQuantity +
                '}';
    }
}
