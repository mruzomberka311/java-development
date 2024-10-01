package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter name");
        String name = scanner.nextLine();



        System.out.println("Please enter your hours you've worked");
        float hours = scanner.nextFloat();

        System.out.println("Please enter your pay rate");
        float rate = scanner.nextFloat();

        float pay = rate * hours;

        System.out.print("$" + pay);

        scanner.nextLine();

        System.out.print(" is your pay for the week " + name);





    }
}
