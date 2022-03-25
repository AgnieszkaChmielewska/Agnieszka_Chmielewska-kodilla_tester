package com.kodilla.school;

public class Grades {
    private int[] values;
    private int size;

    public Grades() {
        this.values = new int[0];
        this.size = 0;
    }

    public void add(int value) {
        /*utworzona tablica mazero elementów, dlatego trzeba utworzyć przed dodaniem nową tablicę z +1 elementem
        najpierw inkrementujemy (zwiększamy o jeden) wartość size opisującą wielkość tablicy.*/
        this.size++;
        /* tworzymy pustą tablicę z nowym rozmiarem*/
        int[] newTab = new int[this.size];
        /*metoda z klasy System: arraycopy.. pozwala
        na skopiowanie tablicy źródłowej do tablicy docelowej, zachowując obecny układ elementów*/
        System.arraycopy(values, 0, newTab, 0, values.length);
        /*przypisujemy nową wartość do ostatniego elementu w tablicy
        (konieczne było odjęcie cyfry jeden od rozmiaru tablicy, indeksy liczymy od zera).*/
        newTab[this.size - 1] = value;
        /*przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie.*/
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public double getAverage() {
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum = sum + this.values[i];
            /*the same: sum += this.values[i]*/
        }
        return sum / this.values.length;
    }

}