import { ParkingSpotEnumMapper } from "../ParkingSpotEnumMapper";
import { Vehicle } from "./Vehicle";
import { ParkingSpotEnum } from "../../enums/ParkingSpotEnum";
import { Mini } from "../parkingSpot/Mini";




export class Bike extends Vehicle {
    
    constructor() {
        super(ParkingSpotEnum.MINI);
        ParkingSpotEnumMapper.getInstance().setParkingSpot(ParkingSpotEnum.MINI,new Mini(0,0));
    }

}