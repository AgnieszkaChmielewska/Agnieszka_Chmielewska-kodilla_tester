package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;


    public class OptionalExample {
        public static void main(String[] args) {
            User user = new User("user1", 30, 100, "Test");
//            User user = null;
            Optional<User> optionalUser = Optional.ofNullable(new User(null,0,0,""));

          optionalUser.orElse(new User("aa",0,0,"")).getUsername();
          optionalUser.ifPresent(u -> System.out.println(new User("",0,0,"").getUsername()));


            System.out.println( optionalUser.get().getUsername());
            //•	get() – pozwala pobrać opakowany obiekt (jeżeli jest nullem, to zostanie rzucony wyjątek, czyli błąd).

        }
    }

