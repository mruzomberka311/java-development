package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2,124.00, false, true,true);
        Reservation reservation1 = new Reservation("double", 124, true, 2);
        Employee employee1 = new Employee("00-890-10", "Mort", "Java",20.0,12);


      double payDay = employee1.getTotalPay();
        System.out.println(" Regular hours pay is" + payDay);

        double overPay = employee1.getOvertimeHours() * 1.5 + payDay;
        System.out.println("Overtime pay total is" + overPay);


        double room1res = reservation1.getReservationTotal();
        System.out.println(room1res);

        if (room1.isDirty()){
            System.out.println(reservation1.getRoomType() + " will be given a 50% discount. Sorry for the inconvenience");
            System.out.println(reservation1.getReservationTotal() - (reservation1.getReservationTotal()* .5));
        }


    }
}
