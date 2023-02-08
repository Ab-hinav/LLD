package org.example.Service;

import org.example.Model.ParkingSpot;

import java.util.List;

public class NearestToEntranceParkingStrategy implements findParkingSpotStrategy {

    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots) {

        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.isFree()) {
                return parkingSpot;
            }
        }

        return null;
    }


}
