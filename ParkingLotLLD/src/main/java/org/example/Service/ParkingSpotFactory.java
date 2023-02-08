package org.example.Service;

import org.example.Model.Vehicle;
import org.example.Model.VehicleType;

public class ParkingSpotFactory {

    public static ParkingSpotManager getParkingSpotManager(Vehicle vehicle){
        if (vehicle.getType()== VehicleType.FOURWHEELER){
            return new FourWheelerSpotManager();
        }
        else if (vehicle.getType()== VehicleType.TWOWHEELER){
            return new TwoWheelerSpotManager();
        }
        else {
            return null;
        }
    }



}
