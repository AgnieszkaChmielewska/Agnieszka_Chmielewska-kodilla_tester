package com.kodilla.stream.exception.homework;

import java.util.Set;

public class Warehouse {
    private Set<Order> orders;

    public Warehouse(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Order> getOrders() {
         return orders;
    }

    Set<Order> addOrder(Order order) {
orders.add(order);
return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
        //       return orders

    }
}