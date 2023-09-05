package org.example.Model;

import java.util.List;

public class ParkingFloor extends BaseEntity{

    List<ParkingSpot> parkingSpots = null;
    int floorId;

    public ParkingFloor(List<ParkingSpot> parkingSpots,int floorId){
        this.parkingSpots = parkingSpots;
        this.floorId = floorId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
