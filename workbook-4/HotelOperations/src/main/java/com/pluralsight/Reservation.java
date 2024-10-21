package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;


    public Reservation(String roomType, double price, boolean isWeekend, int numberOfNights) {
        this.roomType = roomType;
        this.price = price;
        this.isWeekend = isWeekend;
        this.numberOfNights = numberOfNights;
    }


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal(){
        if (roomType.equalsIgnoreCase("king")){
            setPrice(139.00);
        } if (roomType.equalsIgnoreCase("double")){
            setPrice(124.00);
    } else {
            System.out.println("Please enter a valid room type");
        }
        if (isWeekend = true)
        {
            return (price * numberOfNights) - (price * .10);
        }else return price * numberOfNights;
        }
}
