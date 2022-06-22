package com.kodilla.abstracts.homework;

import org.junit.jupiter.api.Test;

class PersonTestSuite {
    Job painter = new Painter(2300) {
    };
    Person person = new Person("Adam", 23, painter);

    @Test
    public void shouldDisplayResponsibilities(){
        person.displayResponsibilities();
    }
}