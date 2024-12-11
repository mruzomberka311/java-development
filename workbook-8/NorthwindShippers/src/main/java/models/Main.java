package models;

import db.DatabaseManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Program needs 2 arguments, <Username> + <Password> in order to run!");
            System.exit(0);
        }

       String username = args[0];
       String password = args[1];

       BasicDataSource dataSource = new BasicDataSource();
       dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
       dataSource.setUsername(username);
       dataSource.setPassword(password);

        DatabaseManager databaseManager = new DatabaseManager(dataSource);

       Scanner scanner = new Scanner(System.in);

       boolean running = true;

        while (running){
            System.out.println("Menu: ");
            System.out.println("1) Insert data");
            System.out.println("5) Exit ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the name of the company: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the phone number of the company: ");
                    String phone = scanner.nextLine();
                    databaseManager.insertShipperData(name,phone);
                    break;

                case 2:
                    databaseManager.displayAllShippers();
                    break;

                case 3:
                    System.out.println("Enter the shipper ID: ");
                    int shipperId = scanner.nextInt();
                    System.out.println("Enter the phone number: ");
                    String updatePhone = scanner.nextLine();
                    databaseManager.updateShippers(shipperId,updatePhone);
                    break;





                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    System.exit(1);
                    break;
            }


        }





    }
}
