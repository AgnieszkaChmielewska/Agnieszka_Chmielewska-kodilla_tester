package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTestSuite {
    private final PrimeChecker checker = new PrimeChecker();
    private static int count = 0;
//    Zmienna statyczna należy do klasy, a nie do obiektu. Dzięki temu raz ustawiona wartość jest "zapamiętywana" pomiędzy poszczególnymi wywołaniami

    @Test
    public void shouldReturnCount(){
        int count = checker.getCount();
        count++;
        assertEquals(1, count);
    }

    @Test
    public void shouldIncrementCount(){
        checker.incrementCount();
        int count = checker.getCount();
        assertEquals(1, count);
    }

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        /*drukowana jest wartość zmiennej count z metody PrimeChecker, to nie pozwoli wyswietlic ilosci testó ponieważ dla każdego testu tworzony jest nowy obiekt typu PrimeChecker, dlatego potrzebna jest zmienna w klasie testującej*/
//        System.out.println(checker.getCount());
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        boolean result = checker.isPrime(13);
        count++;
        System.out.println("Test number: " + count);
//        System.out.println(checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        boolean result = checker.isPrime(2);
        count++;
        System.out.println("Test number: " + count);
//        System.out.println(checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-6);
        count++;
        System.out.println("Test number: " + count);
        assertFalse(result);
    }
}
