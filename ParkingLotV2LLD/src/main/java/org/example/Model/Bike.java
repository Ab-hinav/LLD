package org.example.Model;

public class Bike extends Vehicle{

    ParkingSpotType parkingSpotType;
    public Bike(String name, String regNumber, String color) {
        super(name, regNumber, color);
        parkingSpotType = ParkingSpotType.BIKE;
    }

}
