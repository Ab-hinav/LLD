package org.example.Model;

public class Truck extends Vehicle{

    ParkingSpotType parkingSpotType;

    public Truck(String name, String regNumber, String color) {
        super(name, regNumber, color);
        parkingSpotType = ParkingSpotType.TRUCK;
    }


}
