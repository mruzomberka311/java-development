package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            if (args.length != 2) {
                System.out.println(
                        "Application needs two arguments to run: " + "java com.hca.jdbc.UsingDriverManager <username> " +
                                "<password>");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

            // load the MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);

            boolean running = true;

            while(running){
                displayMenu();
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        String query = "SELECT * FROM products";
                        PreparedStatement statement = connection.prepareStatement(query);
                        ResultSet results = statement.executeQuery();

                        while (results.next()) {
                            int productId = results.getInt("ProductID");
                            String productName = results.getString("ProductName");
                            double unitPrice = results.getDouble("UnitPrice");
                            int unitsInStock = results.getInt("UnitsInStock");

                            System.out.println("Product ID: " + productId);
                            System.out.println("Product Name: " + productName);
                            System.out.println("Unit Price: " + unitPrice);
                            System.out.println("Units In Stock: " + unitsInStock);
                            System.out.println("-----------------------------------------");
                        }


                        results.close();
                        statement.close();
                        break;
                    case 2:
                        String customerQuery = "SELECT * FROM customers;";
                        PreparedStatement statement1 = connection.prepareStatement(customerQuery);
                        ResultSet customerResult = statement1.executeQuery();

                        while(customerResult.next()){
                            String contactName = customerResult.getString("ContactName");
                            String companyName = customerResult.getString("CompanyName");
                            String city = customerResult.getString("City");
                            String country = customerResult.getString("Country");
                            String phone = customerResult.getString("PhoneNumber");
                            System.out.println("Contact Name: " + contactName );
                            System.out.println("Company Name: " + companyName);
                            System.out.println("City: " + city);
                            System.out.println("County: " + country);
                            System.out.println("Phone Number: " + phone);
                        }


                        break;
                    case 0:
                        running = false;
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Not a valid choice");
                        return;
                        break;
                }
            }





            connection.close();

        } catch (ClassNotFoundException | SQLException | SQLException e) {
            e.printStackTrace();
        }

        finally {

        }
    }


    public static void displayMenu(){
        System.out.println("1) Display all products");
        System.out.println("2) Display all customers");
        System.out.println("3) Exit");
    }

}
