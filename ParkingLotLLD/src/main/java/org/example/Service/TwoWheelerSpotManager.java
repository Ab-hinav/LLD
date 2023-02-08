package org.example.Service;

import org.example.Model.ParkingSpot;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager {

    public TwoWheelerSpotManager() {
        super();
        List<ParkingSpot> parkingSpots = null;
        findParkingSpotStrategy strategy = new NearestToEntranceParkingStrategy();
        this.setStrategy(strategy);
        this.setParkingSpots(parkingSpots);
    }

    public TwoWheelerSpotManager(List<ParkingSpot> parkingSpots, findParkingSpotStrategy strategy) {
        super(parkingSpots, strategy);
    }

}
