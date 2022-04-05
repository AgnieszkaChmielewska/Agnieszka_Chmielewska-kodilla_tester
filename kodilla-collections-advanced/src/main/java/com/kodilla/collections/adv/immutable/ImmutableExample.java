package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("John Stewart", "The last chance");
        BookHacked bookHacked =(BookHacked) book; /*jak to czytać?*/
        bookHacked.modifyTitle("Yves Saint Laurent Catwalk");
        System.out.println(book.getTitle());

    }
}
