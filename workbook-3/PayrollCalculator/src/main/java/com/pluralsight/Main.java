package com.pluralsight;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("employees.csv");
            BufferedReader buffer = new BufferedReader(file);

            String line;
            while ((line = buffer.readLine()) !=null){
                System.out.println(line);
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                int hoursWorked = Integer.parseInt(tokens[2]);
                float payRate = Float.parseFloat(tokens[3]);


                Employee employee = new Employee(name,id,hoursWorked,payRate);
                employee.setName(name);
                employee.setEmployeeId(id);
                employee.setHoursWorked(hoursWorked);
                employee.setPayRate(payRate);

                System.out.println("Employee ID:" + "Employee Name: "+ "Hours worked: "+ "Pay rate: ");

                System.out.printf(employee.getName(),"|" , employee.getEmployeeId(),"|", employee.getHoursWorked(),"|",employee.getPayRate());
                //Couldn't find the user error running the code
            }


        }

        catch (Exception ex){
            System.out.println("User error");
            ex.printStackTrace();
        }
    }
}
