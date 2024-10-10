package com.pluralsight;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the file to read: ");
            String inputFileName = scanner.nextLine();

            System.out.println("Enter the name of the file to write: ");
            String outputFileName = scanner.nextLine();

            try {
    // input that we want to read is coming from the user input
                BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
      //output that we want to write is also coming from the user input
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

       //while loop to go line by line reading the file and displaying each part separated by a pipe.
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] tokens = line.split("\\|");
                    int id = Integer.parseInt(tokens[0]);
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    Employee employee = new Employee(id, name, hoursWorked, payRate);
    //had trouble storing output and formatting it in to be able to out it in the writer                
                    String outputLine = String.format("%d|%s|%n", employee.getEmployeeId(),employee.getName(),employee.getGrossPay() );

                    writer.write(outputLine);

                    writer.close();


                }
                reader.close();
            } catch (IOException e) {
                System.err.println("Error processing file: " );
            }
        }
    }

