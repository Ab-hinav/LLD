package org.example.Service;

import org.example.Model.ParkingFloor;
import org.example.Model.ParkingLot;
import org.example.Model.ParkingSpot;
import org.example.Model.ParkingSpotType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotService {

    ParkingLot parkingLot;


    // create parking lot
    public void createParkingLot(ParkingLot parkingLot){
        try {

            this.parkingLot = parkingLot;
            addFloors(parkingLot.getNumOfFloors(), parkingLot.getNumOfSlotsPerFloor());

        } catch (Exception e){
            System.out.println("exception occurred");
        }
    }

    //delete parking lot

    // add parkingspots

    // available parking slots

    // add floors to the parking lot
    public void addFloors(int numOfFloorsToAdd,int slotsPerFloor){
        if (parkingLot==null){
            return;
        }
        List<ParkingFloor> currFloors = parkingLot.getParkingFloorList();

        for (int i = 0; i < numOfFloorsToAdd; i++) {
            List<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
            for (int j = 0; j < slotsPerFloor; j++) {
                if (j == 0) {
                    parkingSpots.add(new ParkingSpot(ParkingSpotType.TRUCK, true));
                } else if (j > 0 && j <= 2) {
                    parkingSpots.add(new ParkingSpot(ParkingSpotType.BIKE, true));
                } else {
                    parkingSpots.add(new ParkingSpot(ParkingSpotType.CAR, true));
                }
            }
            ParkingFloor currFloor = new ParkingFloor(parkingSpots, i+currFloors.size());
            currFloors.add(currFloor);
        }
        parkingLot.setParkingFloorList(currFloors);
    }

    public void addParkingSpot(int floor,ParkingSpotType parkingSpotType){

        List<ParkingFloor> currFloors = parkingLot.getParkingFloorList();
        ParkingFloor currFloor = currFloors.get(floor);

        List<ParkingSpot> currFloorSpots =currFloor.getParkingSpots();
        currFloorSpots.add(new ParkingSpot(parkingSpotType,true));


    }

    public void freeParkingSpot(int floor,int spotNo){
        List<ParkingFloor> currFloors = parkingLot.getParkingFloorList();
        ParkingFloor currFloor = currFloors.get(floor);
        List<ParkingSpot> currFloorSpots =currFloor.getParkingSpots();

        ParkingSpot parkingSpot = currFloorSpots.get(spotNo);
        parkingSpot.setFree(true);


    }






}
