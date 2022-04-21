package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item apples = new Item("Apples", 3.5);
    Item pears = new Item("Pears", 6.5);

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(pears);
        invoice.addItem(apples);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void shouldAddItem() {
        //When
        invoice.addItem(new Item("Bananas", 6.2));
        int numberOfItems = invoice.getSize();
        //Then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldAddedItemNameAndPrice() {
        //When
        invoice.addItem(new Item("Bananas", 6.2));
        //Then
        Item testedItem = invoice.getItem(2);
        String name = testedItem.getName();
        Double price = testedItem.getPrice();
        assertEquals("Bananas", name);
        assertEquals(6.2, price, 0.01);
    }

    @Test
    public void shouldReturnNullWhenItemIndexNegative() {
        //When
        Item testedItem = invoice.getItem(-1);
        //Then
        assertEquals(null, testedItem);
    }

    @Test
    public void shouldReturnNullWhenItemOutOfRange() {
        //When
        Item testedItem = invoice.getItem(99999);
        //Then
        assertEquals(null, testedItem);
        assertNull(testedItem);
    }

    @Test
    public void shouldClearInvoice() {
        //When
        invoice.clear();
        //Then
        assertEquals(0, invoice.getSize());
    }
}
