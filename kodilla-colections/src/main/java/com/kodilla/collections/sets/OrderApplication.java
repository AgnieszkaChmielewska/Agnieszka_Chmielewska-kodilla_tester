package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderApplication {
    public static void main(String[] args) {
        Set<Order> orders = new HashSet<>(); /*tworzy kolekcję orders typu HashSet<Order>*/
        orders.add(new Order("1/2019", "Iron", 1.0)); /* wstawia do kolekcji cztery zamówienia.*/
        orders.add(new Order("2/2019", "Cutlery", 6.0));
        orders.add(new Order("3/2019", "Chair", 2.0));
        orders.add(new Order("1/2019", "Iron", 1.0));

//Pętla for-each natomiast pozwala nam na przeglądanie różnych zbiorów danych (tablice, listy, kolekcje)
//for (Typ zmienna : kolekcja) {
//   // kod
//}
//Iteruj po kolekcji kolekcja i kolejne jej elementy wstawiaj do zmiennej o nazwie zmienna, która jest typu Typ.
// Dla każdego elementu kolekcji ciało pętli wykonywane jest jeden raz.

        System.out.println(orders.size());
        for (Order order : orders) /*dla każdego elementu kolekcji orders wykonaj kod zawarty w ciele pętli*/
            System.out.println(order);
    }
}


