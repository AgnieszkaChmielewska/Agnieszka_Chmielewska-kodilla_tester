package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Żagle",3.5, 4.5,true));
        stamps.add(new Stamp("Motyle",3.1, 4,false));
        stamps.add(new Stamp("Żagle",3.5, 4.5,true));

        System.out.println(stamps.size());

        for (Stamp element :stamps ) {
            System.out.println(element);
        }
    }
}
