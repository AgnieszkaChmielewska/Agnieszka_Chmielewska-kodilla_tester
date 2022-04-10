package com.kodilla.stream.exception;

public class FirstExample {
    public static void main(String[] args) {
        String userName = null;
        String [] nameParts = userName.split(" ");
        System.out.println("Firstname: "+ nameParts [0]);
        System.out.println("Lastname: "+ nameParts [1]);
    }
}
