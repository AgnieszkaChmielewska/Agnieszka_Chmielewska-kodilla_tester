package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
    List<Flight> airportsFlightsTable = new ArrayList<>();
        airportsFlightsTable.add(new Flight("Warsaw", "Berlin"));
        airportsFlightsTable.add(new Flight("Berlin", "Warsaw"));
        airportsFlightsTable.add(new Flight("London", "Berlin"));
        airportsFlightsTable.add(new Flight("Berlin", "London"));
        airportsFlightsTable.add(new Flight("Warsaw", "London"));
        airportsFlightsTable.add(new Flight("London", "Warsaw"));
        return airportsFlightsTable;
    }

    public static void main(String[] args) {
        int sizeOfFlightsTable = getFlightsTable().size();
        System.out.println(sizeOfFlightsTable);
        for (int i = 0; i < sizeOfFlightsTable; i++) {
            System.out.println("Flight from "+getFlightsTable().get(i).departure + " to "+getFlightsTable().get(i).arrival);
        }
    }
}
