package com.kolakowska;


import com.kolakowska.Generics.GenericList;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int newItem = scanner.nextInt();
        list.add(newItem);

        System.out.println("Would you like to add another number?");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("yes")) {
            System.out.println("hooray");
        } else if (answer.equals("no")) {
            System.out.println("What can I get for you?");
        } else {
            System.out.println("Please, answer yes or no.");
            System.out.println("Would you like to add another number?");
        }
        int selectedIndex = scanner.nextInt();
        int number = list.get(selectedIndex);
        System.out.println("Your number is " + number);

        }

}