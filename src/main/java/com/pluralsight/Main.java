package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner uKey = new Scanner(System.in);

        System.out.println("Welcome to the online store");

        homeScreen(uKey);

    }

    public static void homeScreen(Scanner uKey) {
        while (true) {
            System.out.println("Select from the following option");
            System.out.println("\t1 Display products");
            System.out.println("\t2 Display cart");
            System.out.println("\t0 Exit");
            System.out.print("Enter your selection");

            int userOption = uKey.nextInt();
            uKey.nextLine();

            switch (userOption) {
                case 1:
                    displayProducts(uKey);
                    formattedSpace();
                    break;
                case 2:
                    // displayCart(uKey);
                    formattedSpace();
                    break;
                case 0:
                    System.out.println("Thanks for visiting");
                    formattedSpace();
                    uKey.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error!");
                    formattedSpace();
                    uKey.nextLine();
            }

        }
    }
    public static void formattedSpace() {
        System.out.print("/n/n");
    }
    public static void displayProducts(Scanner uKey) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/products.csv"));


        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
