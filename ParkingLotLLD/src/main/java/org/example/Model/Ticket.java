package org.example.Model;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket extends BaseEntity {


    private LocalDateTime entryTime;
    private ParkingSpot parkingSpot;

    public Ticket(LocalDateTime entryTime, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }


}
