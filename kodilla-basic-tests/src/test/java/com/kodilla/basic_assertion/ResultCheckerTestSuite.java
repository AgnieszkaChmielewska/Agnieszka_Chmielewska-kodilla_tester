package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResultCheckerTestSuite {
    private final ResultChecker resultChecker = new ResultChecker();

    @Test
    public void shouldReturnFalseWhenResultsDifferent() {
        boolean result = resultChecker.assertEquals(2, 1);
        Assertions.assertFalse(result);
    }
    @Test
    public void shouldReturnTrueWhenResultsTheSame() {
        boolean result = resultChecker.assertEquals(2, 2);
        Assertions.assertTrue(result);
    }
}