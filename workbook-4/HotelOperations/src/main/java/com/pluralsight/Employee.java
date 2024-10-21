package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;


    public Employee(String employeeId, String name, String department, double payRate, float hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return (double) payRate * hoursWorked;
    }

    public float getRegularHours() {
        if (hoursWorked <= 8) {
            return hoursWorked;
        }

        return 8;
    }

    public float getOvertimeHours() {
        if (hoursWorked > 8) {
            return hoursWorked - 8;
        }else return 0;
    }

}
