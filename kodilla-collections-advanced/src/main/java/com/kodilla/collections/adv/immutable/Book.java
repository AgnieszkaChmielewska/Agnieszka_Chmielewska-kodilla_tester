package com.kodilla.collections.adv.immutable;

public /*final*/ class Book {  /*po dodaniu w klasie słowa final dziedziczenie z klasy nie będzie możliwe*/
    protected final String author;
    protected final String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public final String getAuthor() {
        return author;
    }

    public final String getTitle() {
        return title;
    }
}
