package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner main = new Scanner(System.in);
        System.out.println("What kind of sandwich would you like?(1 or 2)");
        double type = Scanner.nextInt();

        if (type == 1) {
            return = 5.65;
        } else if {(type == 2);
            return  = 8.65;
        } else{
            System.out.println("Input Invalid");
        }


        System.out.println("Please enter your age");
        int age = Scanner.nextInt();

        double discountPercentage = 0;

         if (age <= 17){
            discountPercentage = .10;
         } else if (age >= 65)
             discountPercentage = .20;

          double finalPrice = type * (1- discountPercentage);

        System.out.println(finalPrice);








}
