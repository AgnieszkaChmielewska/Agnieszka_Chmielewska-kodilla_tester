package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
//            showSquareDetails(square);
        showShapeDetails(square);/*przekazywanie różnych klas, które w różny sposób implementują interfejs*/

        Circle circle = new Circle(7.0);
//            showCircleDetails(circle);
        showShapeDetails(circle);/*przekazywanie różnych klas, które w różny sposób implementują interfejs*/

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
//        showTriangleDetails(triangle);
        showShapeDetails(triangle);/*przekazywanie różnych klas, które w różny sposób implementują interfejs*/
    }

    //
//        private static void showSquareDetails(Square square) {
//            System.out.println(square.getArea());
//            System.out.println(square.getPerimeter());
//        }
//
//        private static void showCircleDetails(Circle circle) {
//            System.out.println(circle.getArea());
//            System.out.println(circle.getPerimeter());
//        }
//
//        private static void showTriangleDetails(Triangle triangle) {
//            System.out.println(triangle.getArea());
//            System.out.println(triangle.getPerimeter());
//        }
//
    /*zastosowanie interfejsu (jako argumentu metody) */
    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}

