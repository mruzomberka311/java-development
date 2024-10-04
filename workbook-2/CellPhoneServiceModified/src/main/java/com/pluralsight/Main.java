package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();



        // Prompt user for cell phone information and set the properties
        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();  // Read integer value
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();  // Consume newline

        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();  // Read entire line till newline
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);


        System.out.println("Who are you calling: ");
        String owner2 = scanner.nextLine();
        cellPhone2.setOwner(owner);

        System.out.println("What is the phone number: ");
        String phoneNumber2 = scanner.nextLine();
        cellPhone2.setPhoneNumber(phoneNumber2);

        System.out.println("What is their carrier: ");
        String carrier2 = scanner.nextLine();
        cellPhone2.setCarrier(carrier2);


        System.out.println("What is the model of their phone: ");
        String model2 = scanner.nextLine();
        cellPhone2.setModel(model2);

        System.out.println("What is their serial number: ");
        int serialNumber2 = scanner.nextInt();
        cellPhone2.setSerialNumber(serialNumber2);
//had to move cellphone3 to here
        CellPhone cellPhone3 = new CellPhone(model,serialNumber,carrier,phoneNumber,owner);


        // Close the scanner
        scanner.close();


        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);


        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        cellPhone3.dial(cellPhone2.getPhoneNumber());

        //overloaded method
        cellPhone2.dial(cellPhone1);


    }

    public static void display(CellPhone phone){
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
