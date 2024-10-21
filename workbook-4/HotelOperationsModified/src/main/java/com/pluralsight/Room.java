package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }


    public void  checkIn() {
        boolean checkIn = true;
        if (checkIn = true) {
            isDirty = true;
            isOccupied = true;
        } else {
            System.out.println("This room is occupied please choose another.");
        }
        return;
    }
    public void checkOut() {
            boolean checkOut = true;
            if (checkOut = true) {
                isOccupied = false;
                isDirty = true;
                System.out.println("Room needs to be cleaned.");
            } else {
                System.out.println("This room is ready for check-out.");
            }
        }

        public void cleanRoom(){
        boolean needsCleaned = true;
        if (isDirty || isOccupied){
            needsCleaned = true;

        }else {
            needsCleaned = false;
        }
    }

}
