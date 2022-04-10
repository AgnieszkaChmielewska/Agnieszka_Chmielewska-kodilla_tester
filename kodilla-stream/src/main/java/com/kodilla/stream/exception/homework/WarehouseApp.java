package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse.addOrder(new Order("Order 1"));
        Warehouse.addOrder(new Order("Order 2"));
        Warehouse.addOrder(new Order("Order 3"));
        Warehouse.addOrder(new Order("Order 4"));
        Warehouse.addOrder(new Order("Order 5"));

        try {
           Order order = Warehouse.getOrder("Order 5");
            System.out.println(order.toString()+" exists ");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order doesn't exist");
        }
    }

}
