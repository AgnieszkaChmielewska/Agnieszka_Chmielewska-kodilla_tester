package com.kodilla.basic_assertion;

public class Application {
    public static void main (String[]args){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.summation(a, b);
        int subResult = calculator.subtraction(a,b);
        int squareResult = calculator.squared(a);
        boolean correctSum = ResultChecker.assertEquals(13,sumResult);
        boolean correctSubtraction = ResultChecker.assertEquals(-3,subResult);
        boolean correctSquared = ResultChecker.assertEquals(25, squareResult);

        if (correctSum) {
            System.out.println("Metoda summation działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda summation nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSubtraction) {
            System.out.println("Metoda subtraction działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtraction nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctSquared) {
            System.out.println("Metoda squared działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby" + a );
        }


    }
}

