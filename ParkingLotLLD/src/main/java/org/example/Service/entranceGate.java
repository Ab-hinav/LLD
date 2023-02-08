package org.example.Service;

import org.example.Model.ParkingSpot;
import org.example.Model.Ticket;
import org.example.Model.Vehicle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class entranceGate {

    private String gateId;
    private ParkingSpotFactory parkingSpotFactory;
    private ParkingSpotManager parkingSpotManager;

    public entranceGate(String gateId,ParkingSpotFactory parkingSpotFactory, ParkingSpotManager parkingSpotManager) {
        this.parkingSpotFactory = parkingSpotFactory;
        this.parkingSpotManager = parkingSpotManager;
        this.gateId = gateId;
    }

    public ParkingSpot findParkingSpot(Vehicle vehicle,entranceGate entranceGate){
        parkingSpotManager = parkingSpotFactory.getParkingSpotManager(vehicle);
        ParkingSpot parkingSpot = parkingSpotManager.findFreeSpot();
        return parkingSpot;
    }

    public void bookParkingSpot(Vehicle vehicle , ParkingSpot parkingSpot){
        parkingSpotManager.parkVehicle(parkingSpot,vehicle);
        return;
    }

    public Ticket generateTicket(ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(LocalDateTime.now(),parkingSpot);
        return ticket;
    }




}
