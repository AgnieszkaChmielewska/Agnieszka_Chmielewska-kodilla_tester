package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {

    public static void main (String[]args){
        Random random = new Random();
        Shape[]shapes = new Shape[random.nextInt(20)+1];
        System.out.println("Number of shapes: "+shapes.length);
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();
        for ( Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        Random random = new Random();
        int drawnShapeKind = random.nextInt(3); // possible values: 0, 1, 2
        double a = random.nextDouble() * 100 + 1;     // possible values: from  1 to 100.99999....  ??????
        double b = random.nextDouble() * 100 + 1;
        double c = random.nextDouble() * 100 + 1;
//Za pomocą metody next.Double (losuje od 0 do 1) wylosowaliśmy trzy liczby (a, b, c)
// o wartościach typu double z zakresu od 1 do 100.999….
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }
}
