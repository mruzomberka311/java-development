package com.pluralsight;

import com.sun.tools.javac.Main;

public class MathApp {
    public static void main(String[] args) {

        //Question 1
        int bobSalary = 40000;
        int garySalary  = 50000;

     int highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is");
        System.out.println(highestSalary);
        System.out.println("===========================================================");

        //Question 2

        double carPrice = 26036.99;
        double truckPrice = 90001.50;

        double lowerPrice = Math.min(carPrice,truckPrice);
        System.out.println("The lower price is");
        System.out.println(lowerPrice);
        System.out.println("============================================================");


        //Question 3
        //I tried to use 3.14159 instead of using Math.PI, and I got a little confused.

        double radius = 7.25;
        double area = Math.PI * Math.pow(7.25,2);
        System.out.println("The radius of the circle is" + area);
        System.out.println("=============================================================================");





        //Question 4

        int num = 5;
        double sqroot = Math.sqrt(num);
        System.out.println("The square root of 5 is");
        System.out.println(sqroot);
        System.out.println("=============================================================================");




        //Question 5
        //I overcomplicated this problem by creating too many variables for operations and results.


        int x1 = 5;
        int y1 =  10;
        int x2 = 85;
        int y2 = 50;

        double d = Math.sqrt((Math.pow(x2 - x1, 2) - Math.pow(y2 - y1, 2)));

        System.out.println("D = ");
        System.out.println(d);
        System.out.println("=============================================================================");


        //Question 6

        double number = -3.8;
        double absValue = (int) Math.abs(-3.8);
        System.out.println("The absolute value of -3.8 is");
        System.out.println(absValue);



        //Question 7


        double randomNumb = Math.random();
        System.out.println(randomNumb);






    }
}
