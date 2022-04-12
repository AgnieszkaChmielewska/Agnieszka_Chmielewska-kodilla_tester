package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Set<Order> orders = new HashSet<>();
        Warehouse warehouse = new Warehouse(orders);
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("5"));
        //when
       Order order =  warehouse.getOrder("1");
        //then
        Order expectedOrder = new Order("1");
        assertEquals(expectedOrder, order);
//        assertEquals(new Order("1"),order );
    }
@Test
    public void testGetOrder_incorrect(){
        //given
        Set<Order> orders = new HashSet<>();
        Warehouse warehouse = new Warehouse(orders);
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        //when

        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("6"));
    }

}