package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeNotLeapYearIfNotDivisibleBy4() {

        //given
        Year year = new Year(1601);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4AndNotBy100() {

        //given
        Year year = new Year(1604);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4AndBy100ButNotBy400() {

        //given
        Year year = new Year(1700);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

}