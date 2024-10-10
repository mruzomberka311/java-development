package com.pluralsight;


import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which story would you like to read? ");
        String answer = input.nextLine();
        try {
            FileInputStream files = new FileInputStream(answer);
            Scanner scanner = new Scanner(files);
            String line;


            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
            }
//Couldn't figure out how to make the line numbers
        } catch (Exception ex) {
            System.err.println("Processing error");

        }
    }
}
