package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;
import java.util.List;

public class ShapesListApplication {
    public static void main(String[] args) {
        /*utworzyliśmy zmienną shapes typu List<Square>
        i przypisaliśmy do niej nową, pustą kolekcję w postaci obiektu klasy ArrayList.*/
        List<Square> shapes = new ArrayList<>();
//        Square sq1 = new Square(10.0);
//        Square sq2 = new Square(5.0);
//        Square sq3 = new Square(1.0);
//        shapes.add(sq1);
//        shapes.add(sq2);
//        shapes.add(sq3);
        shapes.add(new Square(10.0));
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));

        for (Square square : shapes)
            if (square.getArea() > 20)
                System.out.println(square + ", area: " + square.getArea());

    }
}

