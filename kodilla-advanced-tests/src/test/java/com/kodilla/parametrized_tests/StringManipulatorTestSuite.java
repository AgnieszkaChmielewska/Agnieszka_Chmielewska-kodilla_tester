package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTestSuite {
    private StringManipulator stringManipulator = new StringManipulator();

    @ParameterizedTest
    @CsvSource(value = {"test,tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void shouldReverseStringWithLowerCase(String input, String expected) {
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void shouldReverseStringWithLowerCase_FromFileSource(String input, String expected) {
        assertEquals(expected, stringManipulator.reverseWithLowerCase(input));
    }


    @ParameterizedTest
 //  @CsvSource(value = {"test  ,4", "OtHEr,5", "E V e n t,5", "null,4", "A,1"})
 //  @CsvSource(value = {"test  ,4", "OtHEr,5", "E V e n t,5", "null,4", "A,1"," ,0"}) - błedne

    //
    @MethodSource(value = "com.kodilla.parametrized_tests.StringSources#provideStringsForTestingLength")
//    private static Stream<Arguments> provideStringsForTestingLength() {               // statyczna metoda, której celem jest przygotowanie danych testowych
//        return Stream.of(
//                Arguments.of("test", 4),
//                Arguments.of("OtHEr ", 5),
//                Arguments.of("E V e n t", 5),
//                Arguments.of("null ", 4),
//                Arguments.of("A", 1)
//        );
//    }
    public void shouldCalculateStringLengthWithoutSpaces(String input, int expected) {
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"te,st:1", "..OtHEr :0", "E,V,e,n.t:3", "null :0", "A:0"}, delimiter = ':')
    public void shouldCountNumberOfCommas(String input, int expected) {
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithCommas.csv", numLinesToSkip = 1, delimiter = ':')
    public void shouldCountNumberOfCommasFromFile(String input, int expected) {
        assertEquals(expected, stringManipulator.countNumberOfCommas(input));
    }
}
