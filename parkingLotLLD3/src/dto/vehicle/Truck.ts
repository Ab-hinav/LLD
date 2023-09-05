// import { ParkingSpotEnumMapper } from "dto/ParkingSpotEnumMapper";
import { ParkingSpotEnum } from "../../enums/ParkingSpotEnum";
import { Vehicle } from "./Vehicle";
// import { Mini } from "dto/parkingSpot/Mini";
import { Large } from "../parkingSpot/Large";





export class Truck extends Vehicle {
    constructor(){
        super(ParkingSpotEnum.LARGE);
        this.getParkingSpotEnumMapper()?.setParkingSpot(ParkingSpotEnum.LARGE,new Large(0,0));
    }
}