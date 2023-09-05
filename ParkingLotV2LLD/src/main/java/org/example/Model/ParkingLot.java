package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseEntity{

    String parkingLotName;
    int numOfFloors;
    int numOfSlotsPerFloor;
    List<ParkingFloor> parkingFloorList;

    public ParkingLot(String name,int numOfFloors,int numOfSlotsPerFloor){
        this.parkingLotName = name;
        this.numOfFloors = numOfFloors;
        this.numOfSlotsPerFloor = numOfSlotsPerFloor;
        this.parkingFloorList = new ArrayList<ParkingFloor>(numOfFloors);
    }

    public String getParkingLotName() {
        return parkingLotName;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public int getNumOfSlotsPerFloor() {
        return numOfSlotsPerFloor;
    }

    public void setNumOfSlotsPerFloor(int numOfSlotsPerFloor) {
        this.numOfSlotsPerFloor = numOfSlotsPerFloor;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }
}
