package com.kodilla.parametrized_tests.homework;

public class InvalidNumbersException extends Exception{
    InvalidNumbersException(){
        super("Wrong numbers provided");
    }
}
