package org.example.Service;

import org.example.Model.ParkingSpot;
import org.example.Model.Vehicle;

import java.util.List;

public class ParkingSpotManager {

    private List<ParkingSpot> parkingSpots;
    private findParkingSpotStrategy strategy;

    public ParkingSpotManager() {
    }

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, findParkingSpotStrategy strategy) {
        this.parkingSpots = parkingSpots;
        this.strategy = strategy;
    }

    public ParkingSpot findFreeSpot(){
        return strategy.findParkingSpot(parkingSpots);
    }

    public void setStrategy(findParkingSpotStrategy strategy) {
        this.strategy = strategy;
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot){
        parkingSpots.remove(parkingSpot);
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public boolean parkVehicle(ParkingSpot parkingSpot, Vehicle vehicle){
        ParkingSpot parkingSpot1 = findFreeSpot();
        return parkingSpot.parkVehicle(vehicle,parkingSpot1);
    }

    public boolean unparkVehicle(ParkingSpot parkingSpot, Vehicle vehicle){
        return parkingSpot.unparkVehicle(vehicle,parkingSpot);
    }



}
