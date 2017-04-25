package com.myapp;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * int res = (int)2.3f -> coś takiego zapisuje literał 2.3 i zapisuje go w formacie pamięci dostępnej dla int'a
 */
public class App {
    public static void main(String[] args) {

        int limit = 100;


        int[] tablica = new int[100];
        for (int i = 0; i < 99; i++)
            tablica[i] = i + 1;

        int zmienna = tablica[3];
        int suma = 0;

        for (int i = 0; i < 100; i++) {
            suma = suma + tablica[i];

        }
        System.out.println(suma/100d);


    }}

     /** tablica z elementami od 0 do 99
     zrobic metode ktora zwroci nam srednia arytmetyczna
     100 intow**/