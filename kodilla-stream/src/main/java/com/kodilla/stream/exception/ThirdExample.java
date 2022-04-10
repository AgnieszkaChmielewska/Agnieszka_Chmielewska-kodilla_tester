package com.kodilla.stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Malta");
        System.out.println("VIENNA STATUS: "+  isViennaInUse);
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by our airlines.");    e.printStackTrace();
        }finally {

        System.out.println("Thank  You for using Kodilla Airlines");
        }
    }
}
