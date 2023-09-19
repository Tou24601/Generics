package com.kolakowska;


import com.kolakowska.Generics.GenericList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(1);
        int number = list.get(0);
        System.out.println(number);

        }

}