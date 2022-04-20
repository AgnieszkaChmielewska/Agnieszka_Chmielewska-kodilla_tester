package com.kodilla.execution_model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item apples = new Item("Apples", 3.5);
    Item pears = new Item("Pears", 6.5);

    @Test
    public void shouldAddItem() {
        //Given
        invoice.addItem(new Item("Pears", 6.5));
        invoice.addItem(new Item("Apples", 3.5));
        //When
        invoice.addItem(new Item("Bananas", 6.2));
        //Then
        assertEquals(3, invoice.getSize());
    }

    @Test
    public void shouldAddedItemNameAndPrice() {
        //Given
        invoice.addItem(new Item("Bananas", 6.2));
        invoice.addItem(new Item("Apples", 3.2));
        invoice.addItem(new Item("Lemons", 4.2));
        //Then
        Item testedItem = invoice.getItem(0);
        String name = testedItem.getName();
        Double price = testedItem.getPrice();
        assertEquals("Bananas", name);
        assertEquals(6.2, price, 0.01);
    }

    @Test
    public void shouldReturnNullWhenItemIndexNegative() {
        //Given
        invoice.addItem(apples);
        invoice.addItem(pears);
        //When
        Item testedItem = invoice.getItem(-1);
        //Then
        assertEquals(null, testedItem);
    }
    @Test
    public void shouldReturnNullWhenItemOutOfRange() {
        //Given
        invoice.addItem(apples);
        invoice.addItem(pears);


        //When
        Item testedItem = invoice.getItem(99999);
        //Then
        assertEquals(null, testedItem);
        assertNull (testedItem);
    }

    @Test
    public void shouldClearInvoice(){
        //Given
        invoice.addItem(new Item("Apples", 3.5));
        invoice.addItem(new Item("Pears", 6.5));

        //When
        invoice.clear();
        //Then
        assertEquals(0,invoice.getSize());


    }

}
