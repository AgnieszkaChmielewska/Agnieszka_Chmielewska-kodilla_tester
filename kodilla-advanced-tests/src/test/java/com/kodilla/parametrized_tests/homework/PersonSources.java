package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    public static Stream<Arguments> providesPersonsForTestingBMI(){
        return Stream.of(
        Arguments.of(new Person(1.6,47.4)),
        Arguments.of(new Person(2.66,16.564)),
        Arguments.of(new Person(1,1)),
        Arguments.of(new Person(1,16))
         );
    }

    public static Stream<Arguments> providesFalsePersonsForTestingBMI(){
        return Stream.of(
        Arguments.of(new Person(00000,47.4)),
        Arguments.of(new Person(2.66,0)),
        Arguments.of(new Person(0,1))
        );
    }
}
