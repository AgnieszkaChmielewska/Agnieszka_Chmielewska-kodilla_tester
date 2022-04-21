package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"aba", "AZD", "Aa1", "D4_", "111", "...", "---", "___", "a-1", "..-_", "AD._-01as"})
    public void shouldReturnTrueIfAllowedCharacterOccursAtLeastThreeTimes(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateUsername(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa", "11", "..", "a1", "EF", "--", "__", "S", "-_", "a", "-", "_", ".", "0"})
    public void shouldReturnFalseIfAllowedCharacterOccursLessThanThreeTimeOrIsEmpty(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"!", "@", "#", "$s", "^1", "&D", "*.", "=_", "+-", "`"})
    public void shouldReturnFalseIfNotAllowedCharacterInUserName(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfEmpty(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfNull(String text) {
        System.out.println("|" + text + "|");
        assertThrows(NullPointerException.class, () -> userValidator.validateUsername(text));
    }

    @Test
    public void shouldReturnFalseIfNull() {
        assertThrows(NullPointerException.class, () -> userValidator.validateUsername(null));
    }


    @ParameterizedTest
    @ValueSource(strings = {"a.!@a.pl", "!@a.pl", "a@a.1", "a@a.!", "a@#.p", "aga@_-.pl", "aga@!.gmailss", "aga@!.gmails", "a@-gmail.waw.com."})
    public void shouldReturnFalseIfNotAllowedCharacterInEmail(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateEmail(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@a.", "g_wp.pl", "@wp.pl", "a@.pl"})
    public void shouldReturnFalseIfRequiredCharactersMissingInEmail(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateEmail(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateEmail(text);
        assertFalse(result);
    }

    // przechodzi pusty email?? NIE
    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfEmailIsEmpty(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateEmail(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@a.pl", "g.1@wp.pl", "0@wp.pl", "a@-gmail.waw.com"})
    public void shouldReturnTrueIfRequiredCharactersInEmail(String text) {
        System.out.println("|" + text + "|");
        boolean result = userValidator.validateEmail(text);
        assertTrue(result);
    }
}