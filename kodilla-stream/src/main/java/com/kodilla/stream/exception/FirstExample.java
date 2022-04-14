package com.kodilla.stream.exception;

import java.util.Optional;

public class FirstExample {
    public static void main(String[] args) {

        String userName ="h h";
        Optional<String> optionalUserName = Optional.ofNullable(userName);
        if (userName != null && userName.contains(" ") ) {
            String[] nameParts = userName.split(" ");
            System.out.println("Firstname: " + nameParts[0]);
            System.out.println("Lastname: " + nameParts[1]);
        }
        else {
            System.out.println("Null");
        }
    }
}