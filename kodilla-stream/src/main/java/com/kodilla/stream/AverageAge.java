package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
//                .map(u -> u.getAge())
                .mapToInt( u -> u.getAge())
                .average()
                .getAsDouble();
        System.out.println(avg);

    }
}
