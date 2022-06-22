package com.kodilla.collections.sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderTestSuite {
    Order order = new Order("23", "Apples", 33);
    Order orderTwo = new Order("12","Oranges", 22);

    @Test
    public void shouldReturnFalse() {
       boolean result = order.equals(orderTwo);
       Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnHashCode() {
       int hashCode = orderTwo.hashCode();
Assertions.assertNotEquals(0, hashCode);
    }

    @Test
    public void shouldReturnProductQuantity() {
        double quantity = order.getQuantity();
        Assertions.assertEquals(33, quantity );
    }

    @Test
    public void shouldReturnProductNumber() {
        String number = order.getOrderNumber();
        Assertions.assertEquals("23", number );
    }

    @Test
    public void shouldReturnProductName() {
        String name = order.getProductName();
        Assertions.assertEquals("Apples", name );
    }
}