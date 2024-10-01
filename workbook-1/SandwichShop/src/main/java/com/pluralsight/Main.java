package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner main = new Scanner(System.in);
        System.out.println("What kind of sandwich would you like?(1 or 2)");
        int type = Scanner.nextInt();

// mistake of not defining my basePrice variable
        double basePrice;
        if (type == 1) {
            basePrice = 5.65;
        } else if (type == 2) {
            basePrice = 8.65;
        } else {
            System.out.println("Input Invalid");
            return;
        }

//mistake with format of if else statement
        System.out.println("Please enter your age");
        int age = Scanner.nextInt();
//mistake of not correctly defining discountPrice variable
        double discountPercentage = 0;

        if (age <= 17) {
            discountPercentage = .10;
        } else if (age >= 65)
            discountPercentage = .20;


        double finalPrice = type * (1 - discountPercentage);

        System.out.println(finalPrice);
        main.close();










}
