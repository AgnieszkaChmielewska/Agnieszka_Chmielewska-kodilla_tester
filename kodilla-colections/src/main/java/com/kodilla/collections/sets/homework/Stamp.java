package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private double height;
    private double width;
    private boolean postmarked;

    public Stamp(String name, double height, double width, boolean postmarked) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.postmarked = postmarked;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean isPostmarked() {
        return postmarked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 && Double.compare(stamp.width, width) == 0 && postmarked == stamp.postmarked && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, postmarked);
    }
}
