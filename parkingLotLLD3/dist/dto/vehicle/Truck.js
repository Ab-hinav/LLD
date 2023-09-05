// import { ParkingSpotEnumMapper } from "dto/ParkingSpotEnumMapper";
import { ParkingSpotEnum } from "../../enums/ParkingSpotEnum";
import { Vehicle } from "./Vehicle";
// import { Mini } from "dto/parkingSpot/Mini";
import { Large } from "../parkingSpot/Large";
export class Truck extends Vehicle {
    constructor() {
        var _a;
        super(ParkingSpotEnum.LARGE);
        (_a = this.getParkingSpotEnumMapper()) === null || _a === void 0 ? void 0 : _a.setParkingSpot(ParkingSpotEnum.LARGE, new Large(0, 0));
    }
}
