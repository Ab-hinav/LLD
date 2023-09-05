package org.example.Service;

import org.example.Model.ParkingLot;
import org.example.Model.Vehicle;

import java.util.List;

public interface ParkingStrategy {

    List<Integer> park(Vehicle vehicle, ParkingLot parkingLot);

    List<Integer> unpark(Vehicle vehicle,ParkingLot parkingLot);

}
