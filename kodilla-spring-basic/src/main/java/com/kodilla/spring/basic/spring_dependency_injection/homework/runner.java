package com.kodilla.spring.basic.spring_dependency_injection.homework;

        public class runner {
            public static void main(String[] args) throws DivideByZeroException {
                Calculator calculator = new Calculator(new Display());
                calculator.divide(2,0);
    }
}
