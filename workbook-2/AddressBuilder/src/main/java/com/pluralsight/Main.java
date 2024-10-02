package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder info = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the following information: ");

        System.out.println("Full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Biiling address: ");
        String billingAddress = scanner.nextLine();

        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State: ");
        String state = scanner.nextLine();

        System.out.println("Billing Zip: ");
        String zip = scanner.nextLine();

        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();




        scanner.close();

        info.append(fullName + "\n\n");
        info.append("Billing Address: \n").append(billingAddress + "\n").append(billingCity + " ");
        info.append(state + ",").append(zip +"\n\n");
        info.append("Shipping Address: \n").append(shippingStreet+ "\n");
        info.append(shippingCity + ",").append(shippingState).append(" "+ shippingZip);



        String results = info.toString();
        System.out.println(results);


    }
}
