package org.example.Service;

import org.example.Model.Ticket;
import org.example.Model.VehicleType;

public class CostComputationFactory {

    public static CostComputation getCostComputation(Ticket ticket) {
        if(ticket.getParkingSpot().getVehicle().getType() == VehicleType.FOURWHEELER) {
            return new FourWheelerCostComputation();
        }
        else if(ticket.getParkingSpot().getVehicle().getType() == VehicleType.TWOWHEELER) {
            return new TwoWheelerCostComputation();
        }
        else {
            return null;
        }
    }


}
