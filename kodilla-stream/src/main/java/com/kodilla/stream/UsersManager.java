package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
       List<String> usernames =  UsersRepository.getUsersList()
                .stream()                       /*uruchamiamy strumień wynikiem działania tej linii jest Stream, przez który przepływają obiekty typu User*/
                .filter(u -> u.getGroup().equals("Chemists"))
               .map(u->u.getUsername()) /*operacja transformująca / metoda map klasy Stream pozwala modyfikować obiekty przepływające*/
 //               .map(UsersManager::getUserName)
//              .forEach(un -> System.out.println(un)); /*wyrażenie terminalne (kolektor).*/
                .collect(Collectors.toList());                        // [2]
        System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
/*Metoda forEach klasy Stream jest kolektorem, który wykonuje daną operację na każdym obiekcie,
przepływającym kolejno przez strumień.
Kolektor "konsumuje" obiekty ze strumienia, nie przekazując ich już dalej, i kończy Stream.*/
