package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = "";
        String middle = "";
        String last = "";
// attempted to use an array instead of substrings

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine().trim();

        int firstSpace = name.indexOf(' ');
        if (firstSpace == 1){
            first = name;
            last = name;
        }else {
    first = name.substring(0, firstSpace);
        }

        name = name.substring(firstSpace).trim();

        int lastSpace = name.indexOf(' ');
        if (lastSpace == -1){
            last = name;
        }else {
            middle = name.substring(0,lastSpace);
            last = name.substring(lastSpace + 1);
        }

        System.out.println("First name:" + first);
        System.out.println("Middle name: " + (middle.isEmpty() ? ("none"): middle));
        System.out.println("Last name: " + last);


        scanner.close();









    }
}
