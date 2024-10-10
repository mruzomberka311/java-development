package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private int hoursWorked;
    private float payRate;
    private double grossPay;

    public Employee(String name, int employeeId, int hoursWorked, float payRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(float payRate,int hoursWorked){
        return (double) payRate * hoursWorked;
    }

    }

