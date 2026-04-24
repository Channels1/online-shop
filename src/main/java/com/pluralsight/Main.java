package com.pluralsight;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner uKey = new Scanner(System.in);

       System.out.println("Welcome to the online store");
       System.out.println("Select from the following option");
       System.out.println("\t1 Display products");
       System.out.println("\t2 Display cart");
       System.out.println("\t0 Exit");
       System.out.print("Enter your selection");

       int userOption = uKey.nextInt();

       switch(userOption) {
           case 1:
               displayProdocuts();
           case 2:
               displayCart();
           case 0:
               System.out.println("Thanks for visiting");
               System.exit(0);
               break;
       }





      //Customers should be able to view all products
       //Arraylist, File reader, method .getProducts

       // They should also be able to search by Product Name, Price or Department
       // Method to search up products through name price or deparment so a switch case may have to be made
       //while loop probably


      // Customers should be able to add products to their cart
       // Hash map with the .put or add

      // Customers should be able to remove products from their cart
    }  //. remove with hashmap
}
