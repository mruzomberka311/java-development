package com.pluralsight;

import java.util.Scanner;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }


    @Override
    public double getValue(){
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice){
            case 1:
               setOriginalCost(getOriginalCost() - (getOriginalCost() *.03)) ;
               break;
            case 2:
                setOriginalCost(getOriginalCost() - (getOriginalCost() * .06));
                break;
            case 3:
                setOriginalCost(getOriginalCost() - (getOriginalCost() * .08));
                break;
            default:
                setOriginalCost(1000);
                break;
                }
        if (getOdometer() >= 100000){
            return getOriginalCost() - (getOriginalCost() * .25);
        }

        return getOriginalCost();
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
