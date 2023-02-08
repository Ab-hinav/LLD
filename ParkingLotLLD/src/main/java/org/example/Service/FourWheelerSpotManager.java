package org.example.Service;

import org.example.Model.ParkingSpot;

import java.util.List;

public class FourWheelerSpotManager extends ParkingSpotManager {

    public FourWheelerSpotManager() {
        super();
        List<ParkingSpot> parkingSpots = null;
        findParkingSpotStrategy strategy = new NearestToEntranceParkingStrategy();
        this.setStrategy(strategy);
        this.setParkingSpots(parkingSpots);
    }

    public FourWheelerSpotManager(List<ParkingSpot> parkingSpots, findParkingSpotStrategy strategy) {
        super(parkingSpots, strategy);
    }
}
