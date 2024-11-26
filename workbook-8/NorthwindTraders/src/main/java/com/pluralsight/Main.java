package com.pluralsight;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection;
        connection = DriverManager.getConnection(
                "jdbc:mysql//localhost:3306/northwind",
                "root","P@ssw0rd");

        Statement statement = connection.createStatement();
        String query = "SELECT ProductName FROM products;";

        ResultSet result = statement.executeQuery(query);
        while(result.next()){
            String productName = result.getString("ProductName");
            System.out.println(result);
        }


        connection.close();

    }
}
