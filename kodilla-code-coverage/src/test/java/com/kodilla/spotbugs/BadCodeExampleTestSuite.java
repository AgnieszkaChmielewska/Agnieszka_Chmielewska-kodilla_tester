package com.kodilla.spotbugs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadCodeExampleTestSuite {
    BadCodeExample badCodeExample1 = new BadCodeExample("a");
    BadCodeExample badCodeExample2 = new BadCodeExample("b");
    BadCodeExample badCodeExample3 = new BadCodeExample("a");

    @Test
    public void shouldGetType() {
        BadCodeExample badCodeExample = new BadCodeExample("a");
        String type = badCodeExample.getType();
        assertEquals("a", type);
    }

    @Test
    public void shouldGetPi() {
        BadCodeExample badCodeExample = new BadCodeExample("a");
        double pi = badCodeExample.getPi();
        assertEquals(Math.PI, pi);
    }

    @Test
    public void shouldNotBeEquals() {
        assertFalse(badCodeExample1.equals(badCodeExample2));
    }

    @Test
    public void shouldNotBeEqualsWhenTypeNull() {
        assertFalse(badCodeExample1.equals(""));
    }

    @Test
    public void shouldBeEquals() {
        assertTrue(badCodeExample1.equals(badCodeExample3));
    }

    @Test
    public void shouldBeEqualsWhenTheSameObject() {
        assertTrue(badCodeExample1.equals(badCodeExample1));
    }

    @Test
    public void shouldBeEqualsWhenHash() {
        int type = badCodeExample1.hashCode();
        System.out.println(type);
        assertEquals(128, type);
    }

}