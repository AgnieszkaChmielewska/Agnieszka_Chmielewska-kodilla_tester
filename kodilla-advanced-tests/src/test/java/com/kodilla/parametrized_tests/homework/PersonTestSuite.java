package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providesPersonsForTestingBMIDescription")
    public void shouldReturnProperDescription(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providesPersonsForTestingBMI")
    public void shouldCalculateBMI(Person person) {
        ArrayList<String> BMIResults = new ArrayList<>(Arrays.asList("Very severely underweight", "Severely underweight", "Underweight", "Normal (healthy weight)", "Overweight", "Obese Class I (Moderately obese)",
                "Obese Class II (Severely obese)" + "Obese Class III (Very severely obese)", "Obese Class IV (Morbidly Obese)", "Obese Class V (Super Obese)", "Obese Class VI (Hyper Obese)"));
        boolean expectedResult = BMIResults.contains(person.getBMI());
        assertTrue(expectedResult);
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providesFalsePersonsForTestingBMI")
    public void shouldNotCalculateBMIWhenZero(Person person) {
        ArrayList<String> BMIResults = new ArrayList<>(Arrays.asList("Very severely underweight", "Severely underweight", "Underweight", "Normal (healthy weight)", "Overweight", "Obese Class I (Moderately obese)",
                "Obese Class II (Severely obese)" + "Obese Class III (Very severely obese)", "Obese Class IV (Morbidly Obese)", "Obese Class V (Super Obese)", "Obese Class VI (Hyper Obese)"));
        boolean expectedResult = BMIResults.contains(person.getBMI());
        assertTrue(
                expectedResult);
    }

}