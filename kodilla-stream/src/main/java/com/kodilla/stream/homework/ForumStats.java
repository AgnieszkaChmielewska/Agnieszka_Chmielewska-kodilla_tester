package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avgPostsUsersOver40 = UsersRepository.getUsersList()

                .stream()
                .filter(n -> n.getAge() >= 40)
                .mapToInt(u -> u.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostsUsersOver40);


        double avgPostsUsersUnder40  = UsersRepository.getUsersList()

                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
        System.out.println(avgPostsUsersUnder40);
    }
}