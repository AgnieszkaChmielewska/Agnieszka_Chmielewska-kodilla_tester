package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
//    public FlightFinder() {
//    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                System.out.println("I have found flight from " + flight.getDeparture() +" to"+ flight.getArrival());
                System.out.println(result.size());
                result.add(flight);
            }
        }
        System.out.println(result.size());
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> result = new ArrayList<>();
        for (Flight flight:FlightRepository.getFlightsTable()) {
            if(flight.arrival.equals(arrival)){
                result.add(flight);
            }
        }        return result;
    }

}