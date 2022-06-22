package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTestSuite {
    Dog dog = new Dog();
@Test
    public void shouldGetVoice(){
    dog.giveVoice();
}
}