package com.pluralsight;


import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scanner.nextLine().trim();


        System.out.println("Enter your Middle Name:");
        String middleName = scanner.nextLine().trim();



        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine().trim();


        System.out.println("Enter your suffix:");
        String suffix = scanner.nextLine().trim();

        String fullName = firstName;
// struggled to figure out how to move past empty space
        if (!middleName.isEmpty()) {
            fullName += " " + middleName.charAt(0) + ".,";
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("\nFull name: " + fullName);


        }



















    }

