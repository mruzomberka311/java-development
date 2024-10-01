package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("What date will you be arriving? (MM/DD/YYYY)");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate arrival = LocalDate.parse(input,formatter);
        System.out.println(arrival);

        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();
        if (tickets == 1){
            System.out.println(tickets + " ticket will be reserverd for " + arrival + " under the name " + name);
        } else {
            System.out.println(tickets + " tickets will be reserved for " + arrival + " under the name " + name);
        }


    }
}
