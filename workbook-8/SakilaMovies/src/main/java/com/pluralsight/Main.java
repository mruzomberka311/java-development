package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Program needs 2 arguments to run. <Username> + <Password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Scanner scanner = new Scanner(System.in);

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);




    }






    public static void displayMovies(BasicDataSource dataSource ){

        String query = "SELECT f.title FROM film f INNER JOIN film_actor d ON d.film_id = f.film_id WHERE actor_id = (SELECT actor_id FROM actor WHERE first_name = ? AND last_name = ?";

        try {

            try(Connection connection = dataSource.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();


        }  catch (Exception e){
            e.printStackTrace();
}


    }

}
