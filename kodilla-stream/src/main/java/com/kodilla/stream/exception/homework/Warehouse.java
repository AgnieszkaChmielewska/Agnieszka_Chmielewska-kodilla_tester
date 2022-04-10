package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    private static Set<Order> orders = new HashSet<>();

    static void addOrder(Order order) {
        orders.add(order);
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
        //       return orders

    }
}