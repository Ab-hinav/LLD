import { ParkingSpot } from "../dto/parkingSpot/ParkingSpot";
import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";






export interface Strategy {

    findParkingSpot(parkingSpotEnum:ParkingSpotEnum):ParkingSpot;


}