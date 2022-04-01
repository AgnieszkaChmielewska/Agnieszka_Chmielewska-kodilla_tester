package com.kodilla.collections.adv.maps.immutable;

public class BookHacked extends Book {
    private String realTitle; /*Klasa BookHacked wprowadza swoje własne pole służące do przechowywania tytułu, które nie jest oznaczone final, w związku z czym może być dowolnie modyfikowane. */

    public BookHacked(String author, String title) {
        super(author, title);
        this.realTitle = title;
    }

    public void modifyTitle(String newTitle) {
//        title = newTitle;  /*Ponieważ zmienna title w klasie BooK jest "final"
//        we Cannot assign a value to final variable 'title'*/
// może być zmieniana jedynie w momencie tworzenia obiektu
// (jako przypisanie wartości w miejscu deklaracji pola lub jako wynik działania konstruktora).

        realTitle = newTitle;
    }

    /*Następnie klasa ta nadpisała getter getTitle w taki sposób, aby odwoływał się do tego nowego pola realTitle, zamiast do oryginalnego title*/
//    @Override /*gettery oznaczone słowem final nie mogą być nadpisywanie.*/
//    public String getTitle(){ /*'getTitle()' cannot override 'getTitle()' in 'com.kodilla.collections.adv.maps.immutable.Book'; overridden method is final*/
//        return realTitle;
//    }
}
