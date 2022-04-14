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

//    public Order isOrderInUse(Order order) throws OrderDoesntExistException {
//        if (getOrders().contains(order)) {
//            return order;
//        } else {
//         throw new OrderDoesntExistException();
//        }
//    }

    public boolean doesOrderExist(Order order) {
//
//        try {
//                return true;
//            } else {
//                throw new OrderDoesntExistException();
//            }
//        } catch (OrderDoesntExistException e) {
//            System.out.println("Sorry");;
//        }
       return  (getOrders().contains(order)) ;

    }

    Set<Order> addOrder(Order order) {
        orders.add(order);
        return orders;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
        //       return orders

    }
}