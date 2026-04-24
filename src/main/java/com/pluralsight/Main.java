package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner uKey = new Scanner(System.in);
        while (true) {

            System.out.println("Welcome to the online store");
            System.out.println("Select from the following option");
            System.out.println("\t1 Display products");
            System.out.println("\t2 Display cart");
            System.out.println("\t0 Exit");
            System.out.print("Enter your selection");

            int userOption = uKey.nextInt();
            uKey.nextLine();

            switch (userOption) {
                case 1:
                    // displayProdocuts();
                    break;
                case 2:
                    // displayCart();
                    break;
                case 0:
                    System.out.println("Thanks for visiting");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error!");
                    uKey.nextLine();
            }




        }
    }
}