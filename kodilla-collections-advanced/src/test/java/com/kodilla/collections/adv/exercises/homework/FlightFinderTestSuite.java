package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    void findFlightsFrom() {
//        Given
        FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder();
//        When
        List<Flight> flights = flightFinder.findFlightsFrom("Warsaw");
//         Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Berlin"));
        expectedList.add(new Flight("Warsaw", "London"));
        assertEquals(2, expectedList.size());
       assertEquals(expectedList, flights);
    }

    @Test
    void findFlightsFrom_incorrect() {
//        Given
        FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder();
//        When
        List<Flight> flights = flightFinder.findFlightsFrom("Warsaw  ");
//        Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Berlin"));
        expectedList.add(new Flight("Warsaw", "London"));
        assertEquals(2, expectedList.size());
        assertEquals(expectedList, flights);
    }

    @Test
    void findFlightsTo() {
//        Given
        FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder();
//        When
        List<Flight> flights = flightFinder.findFlightsTo("Warsaw");
//        Then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Warsaw"));
        expectedList.add(new Flight("London", "Warsaw"));
        assertEquals(2, expectedList.size());
        assertEquals(expectedList, flights);
    }

    @Test
    void findFlightsTo_incorrect() {
//        Given
        FlightRepository.getFlightsTable();
        FlightFinder flightFinder = new FlightFinder();
//        When
        List<Flight> flights = flightFinder.findFlightsTo("-");
//        Then
        List<Flight> expectedList = new ArrayList<>();
        assertEquals(0, expectedList.size());
        assertEquals(expectedList, flights);
    }
}