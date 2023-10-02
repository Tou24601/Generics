package com.kolakowska;


import com.kolakowska.Generics.GenericList;
import com.kolakowska.Generics.User;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var usersList = new GenericList<User>();

        User newUser = new User();

        String newName = "Asia";

        System.out.println(newUser);

        usersList.add(new User());
        User user = usersList.get(0);

        System.out.println(usersList);

      /*  Scanner scanner = new Scanner(System.in);

        String fname;
        String lname;
        int age;

        System.out.print("Enter new user's name: ");
        fname = scanner.next().trim();

        System.out.print("Enter new user's last name: ");
        lname = scanner.next().trim();

        System.out.print("Enter new user's age: ");
        age = scanner.nextInt();


        System.out.println("Which user can I get for you?");
        int selectedIndex = scanner.nextInt();
        User selectedUser = usersList.get(selectedIndex);
        System.out.println("Your user is");

       */




       /* var list = new GenericList<Integer>();
        Scanner scanner = new Scanner(System.in);

        String answer;
        int counter = 0;

        first:
        while (true) {

            System.out.print("Enter your number: ");
            int newItem = scanner.nextInt();
            list.add(newItem);
            counter++;
            if (counter == 10)
                break;
            while (true) {
                System.out.print("Would you like to add another number? ");
                answer = scanner.next().trim().toLowerCase();
                if (answer.equals("yes")) {
                    break;
                } else if (answer.equals("no")) {
                    break first;
                } else System.out.println("Please, enter yes or no.");
            }
        }

        System.out.println("What can I get for you?");
        int selectedIndex = scanner.nextInt();
        int number = list.get(selectedIndex);
        System.out.println("Your number is " + number);*/

        }

}