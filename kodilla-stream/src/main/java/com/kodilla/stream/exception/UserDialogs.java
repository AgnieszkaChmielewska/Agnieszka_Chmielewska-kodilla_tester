package com.kodilla.stream.exception;

import java.util.Scanner;

public class UserDialogs {
    public static int getNumberOfRounds(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter number of rounds:");
            String s = scanner.nextLine();
            try {
                int rounds = Integer.parseInt(s);  /*Parses the string argument as a signed decimal integer.*/
return rounds;
            } catch (Exception e){
                System.out.println("Wrong data. Enter only digits. Try again.");
            }
        }
    }
}
