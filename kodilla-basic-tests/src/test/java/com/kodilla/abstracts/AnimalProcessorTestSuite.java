package com.kodilla.abstracts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalProcessorTestSuite {
    AnimalProcessor animalProcessor = new AnimalProcessor();
    Animal dog = new Dog();
    Animal duck = new Duck();

    @Test
    public void shouldProcess() {

        animalProcessor.process(dog);
    }

    @Test
    public void shouldReturnFourNumberOfLegs() {

        int numbersOfLegs = dog.getNumberOfLegs();

        Assertions.assertEquals(4, numbersOfLegs);
    }

    @Test
    public void shouldReturnTwoNumberOfLegs() {

        int numbersOfLegs = duck.getNumberOfLegs();

        Assertions.assertEquals(2, numbersOfLegs);
    }
}