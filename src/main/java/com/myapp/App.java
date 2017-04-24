package com.myapp;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * int res = (int)2.3f -> coś takiego zapisuje literał 2.3 i zapisuje go w formacie pamięci dostępnej dla int'a
 */
public class App {
    public static void main(String[] args) {

        float result = 4/3;
        System.out.println(result);
    }



}


