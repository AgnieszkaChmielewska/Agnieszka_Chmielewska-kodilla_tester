package com.kodilla.collections.sets.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StampTestSuite {
    Stamp stamp = new Stamp("One", 23, 12, false);
    Stamp stampTwo = new Stamp("Two", 12, 12, true);

    @Test
    public void shouldReturnFalseWhenDifferent() {
        boolean result = stamp.equals(stampTwo);
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnFalse() {
        boolean result = stamp.isPostmarked();
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnWidth() {
        double width = stamp.getWidth();
        Assertions.assertEquals(12, width);
    }

    @Test
    public void shouldReturnHeight() {
        double height = stamp.getHeight();
        Assertions.assertEquals(23, height);
    }

    @Test
    public void shouldReturnName() {
        String name = stamp.getName();
        Assertions.assertEquals("One", name);
    }
}