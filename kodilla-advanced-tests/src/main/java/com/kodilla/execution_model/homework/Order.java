package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
  private final double price;
  private final LocalDate orderDate;
  private final String userLogin;

   Order(double price, LocalDate orderData, String userLogin) {
        this.price = price;
        this.orderDate = orderData;
        this.userLogin = userLogin;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 && Objects.equals(orderDate, order.orderDate) && Objects.equals(userLogin, order.userLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, orderDate, userLogin);
    }
}
