package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);

        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.println("id: %d %s - Price: $%.2", p.getId(), p.getName(), p.getPrice());

        }




    public ArrayList<Product> getInventory(){
        ArrayList<Product> inventory = new ArrayList<>();
      inventory.add(new Product(022, "Paint Can", 12.99));
      inventory.add(new Product(076, "Screwdriver", 10.99));
      inventory.add(new Product(066, "Box of screws", 8.99));
      inventory.add(new Product(060, "Tape", 2.99));
      inventory.add(new Product(040, "Paint brush", 13.50));
return inventory;


    }
}
