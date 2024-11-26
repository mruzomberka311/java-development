package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("System needs two arguments to run." + "");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT ProductId,ProductName,UnitPrice, UnitsInStock FROM products ORDER BY ProductId;");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println();
            }

        }
        catch (Exception e){
            System.err.println("Error");
            e.printStackTrace();
        }

}
