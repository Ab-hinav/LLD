package org.example.Model;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket extends BaseEntity{

    String generatedId;
    int floorNo;
    int slotNo;
    String ParkingLotName;
    LocalDateTime timeStamp;

    public Ticket(String ParkingLotName,int floorNo,int slotNo){
        this.generatedId = ParkingLotName+"_"+floorNo+"_"+slotNo;
        timeStamp = LocalDateTime.now();
    }

    public void setGeneratedId(String generatedId) {
        this.generatedId = generatedId;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public String getParkingLotName() {
        return ParkingLotName;
    }

    public void setParkingLotName(String parkingLotName) {
        ParkingLotName = parkingLotName;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getGeneratedId(){
        return generatedId;
    }

}
