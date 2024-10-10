package com.pluralsight;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    public static void main(String[] args) {
        static HashMap<Integer,Product> inventory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What item # are you interested in? ");

        inventory.put(loadInventory);
        System.out.println(inventory);


        int id = scanner.nextInt();


        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }


    private static void loadInventory() {
        try {
            BufferedReader buffer = new BufferedReader("inventory.csv");
            String line;
            while (line = buffer.readLine() != null) {
                String[] cleaned = line.split("\\|")

            }
        } catch (Exception e) {
            System.err.println("Processing Error");

        }

    }
}
