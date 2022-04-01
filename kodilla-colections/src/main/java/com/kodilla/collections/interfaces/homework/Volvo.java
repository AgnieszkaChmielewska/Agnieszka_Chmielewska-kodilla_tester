package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Volvo implements Car {

    private int speed;

    public Volvo(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 40;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 38;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volvo)) return false;
        Volvo volvo = (Volvo) o;
        return speed == volvo.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
