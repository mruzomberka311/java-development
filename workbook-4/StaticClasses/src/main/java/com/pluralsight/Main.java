package com.pluralsight;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Please enter your full name: ");

        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();

        ArrayList<String> names = new ArrayList<String>();
        String[] tokens = fullName.split(" ");
        String prefix = tokens[1];
        String firstName = tokens[2];
        String lastName = tokens[3];
        String middleName = tokens[4];
        String suffix = tokens[5];



        }


        String way1 = NameFormatter.format(String prefix, String firstName, String middleName, String lastName, String suffix);


    }
}
