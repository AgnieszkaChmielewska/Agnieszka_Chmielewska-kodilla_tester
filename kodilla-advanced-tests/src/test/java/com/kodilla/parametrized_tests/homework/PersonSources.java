package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    public static Stream<Arguments> providesPersonsForTestingBMI(){
        return Stream.of(
        Arguments.of(new Person(1.6,38)),
        Arguments.of(new Person(2.66,16.564)),
        Arguments.of(new Person(1,1)),
        Arguments.of(new Person(1,16))
         );
    }

    public static Stream<Arguments> providesPersonsForTestingBMIDescription(){
        return Stream.of(
        Arguments.of(new Person(1.6,40), "Severely underweight"),
        Arguments.of(new Person(1.66,12.564), "Very severely underweight"),
        Arguments.of(new Person(1.6,47.5), "Normal (healthy weight)"),
        Arguments.of(new Person(1,16),"Underweight"),
        Arguments.of(new Person(1,15.9),"Severely underweight"),
        Arguments.of(new Person(1,25.1),"Overweight"),
        Arguments.of(new Person(1,34.95),"Obese Class I (Moderately obese)"),
        Arguments.of(new Person(1,35),"Obese Class II (Severely obese)"),
        Arguments.of(new Person(1,48),"Obese Class IV (Morbidly Obese)"),
        Arguments.of(new Person(1,50.1),"Obese Class V (Super Obese)"),
        Arguments.of(new Person(1,60),"Obese Class VI (Hyper Obese)")
        );
    }

    public static Stream<Arguments> providesFalsePersonsForTestingBMI(){
        return Stream.of(
        Arguments.of(new Person(00000,47.4)),
        Arguments.of(new Person(-2.66,0)),
        Arguments.of(new Person(0,1))
        );
    }
}
