package models;

import jb.DatabaseManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("This program requires 2 arguments to run. <Username> + <Password>");
            System.exit(0);
        }

        String username = args[0];
        String password = args[1];

        Scanner scanner = new Scanner(System.in);

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        DatabaseManager databaseManager = new DatabaseManager(dataSource);

        boolean running = true;

        while (running){
            System.out.println("Menu: ");
            System.out.println("1) CustOrderHistory");
            System.out.println("2) SalesByYear");
            System.out.println("3) SalesByCategory");
            System.out.println("0) Exit");

            int choice = scanner.nextInt();
            switch(choice){
                case 1:

                    databaseManager.custOrderHistoryProcedure();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("Exiting...");
                    running = false;
                    System.exit(0);
                    break;

            }

        }
    }
}
