package com.kodilla.abstracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTestSuite {

    Animal animal = new Animal(4) {
        @Override
        public void giveVoice() {
                    }
    };

    @Test
    public void shouldReturnNumberOfLegs(){
        int numberOfLegs = animal.getNumberOfLegs();
        Assertions.assertEquals(4, numberOfLegs);
    }


    @Test
    public void shouldGiveVoice(){
        animal.giveVoice();
    }



}