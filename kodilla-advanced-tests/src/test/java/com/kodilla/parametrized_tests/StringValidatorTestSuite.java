package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuite {

    private StringValidator stringValidator = new StringValidator();

    @ParameterizedTest
    @ValueSource (strings = {" ",  "     "})
    public void shouldReturnTrueIfStringHasOnlySpaces(String text) {
        boolean result = stringValidator.isBlank(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text) {
        assertTrue(stringValidator.isBlank(text));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertTrue(stringValidator.isBlank(text));
    }


    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsNullOrEmpty(String text) {
        System.out.println("|" + text + "|");
        assertTrue(stringValidator.isBlank(text));
    }
}
