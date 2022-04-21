package com.kodilla.parametrized_tests;

public class StringManipulator {
    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        if (input==null){
            return 0;
        }
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    public int countNumberOfCommas(String text) {
//        ?????
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}
