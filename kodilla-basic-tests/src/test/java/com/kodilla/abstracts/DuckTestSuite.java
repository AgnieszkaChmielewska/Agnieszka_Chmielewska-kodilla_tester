package com.kodilla.abstracts;

import org.junit.jupiter.api.Test;

class DuckTestSuite {
    Duck duck = new Duck();

    @Test
    public void shouldGetVoice() {
        duck.giveVoice();
    }
}