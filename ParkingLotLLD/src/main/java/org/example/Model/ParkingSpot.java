package org.example.Model;

public class ParkingSpot extends BaseEntity {


    private boolean isFree;
    private Vehicle vehicle;
    private double price;

    public ParkingSpot( boolean isFree, double price) {
        this.isFree = isFree;
        this.price = price;
    }

    public boolean isFree() {
        return isFree;
    }

    public boolean parkVehicle(Vehicle vehicle,ParkingSpot parkingSpot) {
        if (parkingSpot.isFree()){
            parkingSpot.vehicle = vehicle;
            parkingSpot.isFree = false;
            return true;
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle,ParkingSpot parkingSpot) {
        if (!parkingSpot.isFree()){
            parkingSpot.vehicle = null;
            parkingSpot.isFree = true;
            return true;
        }
        return false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
