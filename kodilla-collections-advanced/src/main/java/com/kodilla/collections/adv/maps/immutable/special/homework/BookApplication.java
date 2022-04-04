package com.kodilla.collections.adv.maps.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

        BookManager.createBook("Harry's Trees", "Jon Cohen");
        System.out.println(BookManager.getSizeOfCollection());

        BookManager.createBook("Nigella Express", "Lawson, Nigella");
        System.out.println(BookManager.getSizeOfCollection());

        BookManager.createBook("Harry's Trees", "Jon Cohen");
        System.out.println(BookManager.getSizeOfCollection());

        System.out.println(BookManager.getBooks(0).equals(BookManager.getBooks(1)));

        Book bookOne = new Book("Harry's Trees", "Jon Cohen");
        BookManager.books.add(bookOne);
        Book bookTwo = new Book("Harry's Trees", "Jon Cohen");
        BookManager.books.add(bookTwo);

        System.out.println(bookOne.equals(bookTwo));


    }
}
