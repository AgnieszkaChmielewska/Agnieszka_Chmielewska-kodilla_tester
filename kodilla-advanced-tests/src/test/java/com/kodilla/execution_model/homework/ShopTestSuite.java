package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(100, LocalDate.of(2022, 04, 23), "User1");
    Order order2 = new Order(200, LocalDate.of(2022, 04, 21), "User3");
    Order order3 = new Order(300, LocalDate.of(2022, 04, 25), "User2");

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void numberOfOrdersShouldIncreaseWhenOrderAdded() {
        System.out.println("Number of orders before adding:" + shop.getNumberOfOrders());
        //When
        shop.addOrder(new Order(10, LocalDate.now(), "User1"));
        //Then
        assertEquals(4, shop.getNumberOfOrders());
    }

    @Test
    public void orderShouldBeAdded() {
        Order order4 = new Order(500, LocalDate.of(2022,04,21),"User5");
        shop.addOrder(order4);
        assertEquals(500, order4.getPrice());
        assertEquals(LocalDate.of(2022,04,21), order4.getOrderDate());
    }

    @Test
    public void numberOfOrdersShouldNotIncreaseWhenDuplicatedOrderAdding() {
        System.out.println("Number of orders before adding:" + shop.getNumberOfOrders());
        //When
        shop.addOrder(new Order(100, LocalDate.of(2022, 04, 23), "User1"));
        //Then
        assertEquals(3, shop.getNumberOfOrders());
    }

    @Test
    public void numberOfOrdersShouldNotIncreaseWhenOrderWithValueZeroOrNegativeAdding() {
        //When
        shop.addOrder(new Order(-10, LocalDate.of(2022, 04, 23), "User1"));
        shop.addOrder(new Order(0, LocalDate.of(2022, 04, 23), "User1"));
        //Then
        assertEquals(3, shop.getNumberOfOrders());
    }

    @Test
    public void numberOfOrdersShouldNotIncreaseWhenOrderWithOldDate() {
        //When
        shop.addOrder(new Order(10, LocalDate.of(2000, 04, 23), "User1"));
        //Then
        assertEquals(3, shop.getNumberOfOrders());
    }

    @Test
    public void numberOfOrdersInReversedRageOfDates() {
        //When
        System.out.println(shop.getNumberOfOrders());
        Set<Order> result = shop.getOrdersBetweenDates(LocalDate.of(2022, 04, 22), LocalDate.of(2022, 04, 19));
        //Then
        assertNull(result);
    }

    @Test
    public void numberOfOrdersInRageOfDates() {
        //When
        System.out.println(shop.getNumberOfOrders());
        Set<Order> result = shop.getOrdersBetweenDates(LocalDate.of(2022, 04, 19), LocalDate.of(2022, 04, 22));
        //Then
        assertEquals(1, result.size());
    }

    @Test
    public void numberOfOrdersInRangeOfValue() {
        //When
        System.out.println(shop.getNumberOfOrders());
        Set<Order> result = shop.getOrdersFromRangeOfValues(150, 250);
        //Then
        assertEquals(1, result.size());
    }

    @Test
    public void sumValueOfOrders() {
        //When
        double result = shop.valueOfOrders();
        System.out.println(shop.getNumberOfOrders());
        //Then
        assertEquals(600, result);
    }
}