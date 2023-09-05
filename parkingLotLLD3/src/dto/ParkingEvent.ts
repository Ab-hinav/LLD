import { ParkingEventType } from "../enums/ParkingEventType";
import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";





export class ParkingEvent {
    parkingSpotEnum: ParkingSpotEnum;
    parkingEventType: ParkingEventType;


    constructor(parkingEventType:ParkingEventType, parkingSpotEnum:ParkingSpotEnum){
        this.parkingEventType = parkingEventType;
        this.parkingSpotEnum = parkingSpotEnum;
    }



}