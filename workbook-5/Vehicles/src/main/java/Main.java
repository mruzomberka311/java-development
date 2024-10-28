public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Blue");
        slowRide.setFuelCapacity(5);


        Car vroom = new Car();
        vroom.setNumberOfPassengers(200);


        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setNumberOfTrailors(1);
        bigTruck.setTopSpeed(120);


        HoverCraft hoverBoard = new HoverCraft();
        hoverBoard.setFuelCapacity(50);
        hoverBoard.setAirCushionPressure(100);

        hoverBoard.hover();
    }
}
