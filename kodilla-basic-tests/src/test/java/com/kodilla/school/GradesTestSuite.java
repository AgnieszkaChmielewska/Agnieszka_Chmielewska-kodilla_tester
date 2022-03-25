package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTestSuite {
    private final Grades grades = new Grades();

    @Test
    /*test weryfikuje, czy w nowym obiekcie Grades tablica z ocenami jest pusta*/
    public void shouldHaveZeroLength() {
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }

    @Test
    /*sprawdza, czy po dodaniu dwóch ocen tablica ma odpowiedni rozmiar oraz
    czy znajdują się w niej dodane wartości*/
    public void shouldAddTwoElementsToArray(){
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2,values.length);
        assertEquals(4,values[0]);
        assertEquals(2, values[1]);
    }

    @Test
    public void shouldCalculateAverage(){
        grades.add(4);
        grades.add(2);
        grades.add(5);
        /* (4+2+5)/3=3,66 */

        assertEquals(3.66, grades.getAverage(), 0.01);
    }
}
