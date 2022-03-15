package userapp;

import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);                 // [1] ?? System.in
        while (true) {                                            // [2]
            System.out.println("Enter your name:");                // [3]
            String name = scanner.nextLine().trim();               // [4]
            if (name.length() >= 2) {                              // [5]
                return name;                                        // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static String getUsersColorSelection(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Select color (A, B, C, D):");
            String selectedColor = scanner.nextLine().trim().toUpperCase();
            switch (selectedColor){
                case "A":
                    return String.valueOf(Colors.AZURE);
                case "B":
                    return String.valueOf(Colors.BLACK);
                case "C":
                    return String.valueOf(Colors.CYAN);
                case "D":
                    return String.valueOf(Colors.DEEP_PINK);
            }
        }
    }
}
