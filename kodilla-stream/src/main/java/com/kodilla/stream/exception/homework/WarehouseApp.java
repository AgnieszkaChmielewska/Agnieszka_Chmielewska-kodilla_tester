package com.kodilla.stream.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Set<Order> orders = new HashSet<>();
        Warehouse warehouse = new Warehouse(orders);
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("5"));

        System.out.println(warehouse.getOrders().size());
        try {
            Order order = warehouse.getOrder("2");
            System.out.println(order.toString() + " exists ");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist");
        }

    }

}
