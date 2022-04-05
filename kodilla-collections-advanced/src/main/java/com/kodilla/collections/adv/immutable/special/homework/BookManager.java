package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);

        for (Book bookInCollection : books) { /*Iteruj po kolekcji kolekcja i kolejne jej elementy wstawiaj do zmiennej o nazwie zmienna, która jest typu Typ.*/
            if (bookInCollection.equals(newBook)) {
                System.out.println(bookInCollection.getTitle() + " by " + bookInCollection.getAuthor() + " already exist in our collection!");
                return bookInCollection;
            }
        }
        books.add(newBook);
       System.out.println(newBook.getTitle() + " by " + newBook.getAuthor() + " has been added to our collection!");
        return newBook;
    }


    public static List<Book> getBooks(int i) {
        return books;
    }

    public static int getSizeOfCollection() {
        return books.size();
    }

}
