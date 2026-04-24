package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

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

    public static HashMap<String, Product> loadInventory() {
        HashMap<String, Product> products = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/products.csv"));
            String productItem;
            br.readLine();
            while ((productItem = br.readLine()) != null) {
                String[] splitProductItem = productItem.split(Pattern.quote("|"));

                String productId = splitProductItem[0];
                String productName = splitProductItem[1];
                double price = Double.parseDouble(splitProductItem[2]);
                String department = splitProductItem[3];

                Product product = new Product(productId, productName, price, department);

            }


        } catch (IOException e) {
            e.printStackTrace();

        }
        return products;

    }

    public static void displayProducts(Scanner uKey) {
        HashMap<String, Product> products = loadInventory();
        boolean run = true;

        while (run) {
            System.out.println("\t1 Search");
            System.out.println("\t2 Add");
            System.out.println("\t3 View all");
            System.out.println("\t0 go back");
            int action = uKey.nextInt();

            switch (action) {
                case 1:
                    for (Product p : products.values()) {
                        System.out.printf("%s: $%.2f%n", p.getProductName(), p.getProductPrice());
                    }
                    formattedSpace();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    break;
                default:
                    System.out.println();
                    uKey.nextLine();
                    formattedSpace();

            }




        }

    }
}
