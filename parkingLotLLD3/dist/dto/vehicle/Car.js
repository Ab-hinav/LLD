import { ParkingSpotEnum } from "../../enums/ParkingSpotEnum";
import { Vehicle } from "./Vehicle";
import { ParkingSpotEnumMapper } from "../ParkingSpotEnumMapper";
import { Compact } from "../parkingSpot/Compact";
// import { ParkingSpot } from "dto/parkingSpot/ParkingSpot";
export class Car extends Vehicle {
    constructor() {
        super(ParkingSpotEnum.COMPACT);
        ParkingSpotEnumMapper.getInstance().setParkingSpot(ParkingSpotEnum.COMPACT, new Compact(0, 0));
    }
}
