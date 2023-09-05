package org.example.Service;

import org.example.Model.ParkingLot;
import org.example.Model.Ticket;
import org.example.Model.Vehicle;

import java.util.List;

public class ParkingService {
    ParkingLot parkingLot;

    //parking strategy
    ParkingStrategy parkingStrategy;
    ParkingLotService parkingLotService;

    public ParkingService(ParkingLot parkingLot,ParkingStrategy parkingStrategy,ParkingLotService parkingLotService){
        this.parkingLot = parkingLot;
        this.parkingStrategy = parkingStrategy;
        this.parkingLotService = parkingLotService;
    }

    public void parkVehicle(Vehicle vehicle){
        List<Integer> floorAndSlot = parkingStrategy.park(vehicle,parkingLot);
        Ticket ticket = new Ticket(parkingLot.getParkingLotName(),floorAndSlot.get(0),floorAndSlot.get(1));
        vehicle.addTicket(ticket);
    }




    // unpark vehicle
    public void unParkVehicle(Vehicle vehicle){
        Ticket ticket = vehicle.getTicket();
        int floorNo = ticket.getFloorNo();
        int spotNo = ticket.getSlotNo();
        parkingLotService.freeParkingSpot(floorNo,spotNo);

    }



}
