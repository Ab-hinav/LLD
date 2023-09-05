package org.example.Model;

public class ParkingSpot extends BaseEntity{

     int floorId;
     boolean isFree;
     Vehicle vehicle;
     ParkingSpotType parkingSpotType;


    public ParkingSpot(ParkingSpotType vehicleType, boolean isFree) {
        this.parkingSpotType = vehicleType;
        this.isFree = isFree;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
