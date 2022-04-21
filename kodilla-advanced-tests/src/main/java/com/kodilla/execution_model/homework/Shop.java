package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shop)) return false;
        Shop shop = (Shop) o;
        return Objects.equals(orders, shop.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "orders=" + orders +
                '}';
    }

    public void addOrder(Order order) {
        if (order.getPrice() < 0 || order.getPrice() == 0) {
            return;
        } else if (order.getOrderDate().isBefore(LocalDate.now())) {
            return;
        } else {
            this.orders.add(order);
        }
    }

    public Set<Order> getOrdersBetweenDates(LocalDate orderDateFrom, LocalDate orderDateTo) {
        if (orderDateFrom.isAfter(orderDateTo)) {
            return null;
        }
        Set<Order> ordersInRangeOfDate =  orders
                .stream()
                .filter(u ->u.getOrderDate().isAfter(orderDateFrom))
                .filter(un -> un.getOrderDate().isBefore(orderDateTo))
                .collect(Collectors.toSet());
        return ordersInRangeOfDate;

        //        for (Order order : orders) {
//            System.out.println(order.getOrderDate());
//            if (order.getOrderDate().isAfter(ordersDateFrom) && order.getOrderDate().isBefore(ordersDateTo)) {
//                orders.add(order);
//                System.out.println("Order added" + order.getOrderDate());
//            }
//        }
    }

    public Set<Order> getOrdersFromRangeOfValues(double orderPriceFrom, double orderPriceTo) {
        Set<Order> ordersInRangeOfValue = orders
                .stream()
                .filter(u -> u.getPrice() >= orderPriceFrom)
                .filter(un -> un.getPrice() <= orderPriceTo)
                .collect(Collectors.toSet());
        return ordersInRangeOfValue;
//
//        for (Order order : orders) {
//            if (order.getPrice() >= orderPriceFrom && order.getPrice() <= orderPriceTo) {
//                ordersByValue.add(order);
//            }
//        }
//        return ordersByValue;
//    }
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double valueOfOrders() {

        double valueOfOrders = 0;
        for (Order order : this.orders) {
            valueOfOrders += order.getPrice();
        }
        return valueOfOrders;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addOrder(new Order(10, LocalDate.of(2022, 04, 29), "e"));
        shop.addOrder(new Order(10, LocalDate.of(2022, 04, 26), "e"));
        shop.addOrder(new Order(10, LocalDate.of(2022, 04, 25), "e"));

        System.out.println(shop.getOrdersBetweenDates(LocalDate.of(2022, 04, 24), LocalDate.of(2022, 04, 27)).size());
    }
}
