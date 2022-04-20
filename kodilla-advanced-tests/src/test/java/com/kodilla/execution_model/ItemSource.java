package com.kodilla.execution_model;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ItemSource {
    static Stream<Arguments> providesItems() {
        return Stream.of(
                Arguments.of(new Item("Jabłka", 3.9)),
                Arguments.of(new Item("Gruszki", 6.2)),
                Arguments.of(new Item("Pomarańcze", 4.7))
        );
    }


}
