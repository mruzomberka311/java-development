package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RoomTest {


    @Test
    public void checkIn_should_displayCheckedIn {

        //Arrange
    Room room1 = new Room(2,124.00);
    boolean isOccupied = false;
    boolean isDirty = false;


        //Act
        room1.checkIn();



        //Assert
    boolean expectedValue = true;
    boolean actualValue = room1.checkIn();
    assertEquals(expectedValue,actualValue);
    }




    @Test
    public void checkOut_should_displayCheckedOut{
        //Arrange
    Room room2 = new Room(3, 248.00);
    boolean occupied = false;




        //Act
    room2.checkout();




        //Assert
    boolean expectedValue = false;
    boolean actualValue = room2.checkout();
    asserEquals(expectedValue,actualValue);
    }



    @Test
    public void cleanRoom_should_displayRoomState{
        //Arrange
    Room room3 = new Room(4, 360.00);
    boolean isOccupied = false;

        //Act
    room3.cleanRoom();


        //Assert
    boolean expectedValue = false;
    boolean actualValue = room3.cleanRoom();
    assertEquals(expectedValue,actualValue);

    }



  
}