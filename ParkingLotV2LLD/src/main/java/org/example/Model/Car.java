package org.example.Model;

public class Car extends Vehicle{

    ParkingSpotType parkingSpotType;

    public Car(String name, String regNumber, String color) {
        super(name, regNumber, color);
        parkingSpotType = ParkingSpotType.CAR;
    }


}
