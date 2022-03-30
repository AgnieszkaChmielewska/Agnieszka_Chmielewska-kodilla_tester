package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> pupils = new ArrayList<>();

    public School(String schoolName, Integer... pupils) {
        this.schoolName = schoolName;
        for (Integer pupil : pupils) {
            this.pupils.add(pupil);
        }
    }


}
