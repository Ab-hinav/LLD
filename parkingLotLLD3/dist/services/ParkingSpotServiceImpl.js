import { ParkingLot } from "../dto/ParkingLot";
import { ParkingSpotEnumMapper } from "../dto/ParkingSpotEnumMapper";
import { DisplayServiceImpl } from "./DisplayServiceImpl";
// import { DisplayService } from "interfaces/DisplayService";
import { ParkingEventType } from "../enums/ParkingEventType";
import { ParkingEvent } from "../dto/ParkingEvent";
export class ParkingSpotServiceImpl {
    constructor() {
        this.displayService = new DisplayServiceImpl();
    }
    create(parkingSpotEnum, floor) {
        var _a;
        let parkingSpotEnumMapper = ParkingSpotEnumMapper.getInstance();
        let parkingSpotObj = parkingSpotEnumMapper.getParkingSpot(parkingSpotEnum);
        if (parkingSpotObj === null) {
            throw new Error("ParkingSpotEnum not found");
        }
        let parkingSpot = Object.create(parkingSpotObj);
        parkingSpot.floor = floor;
        (_a = ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum)) === null || _a === void 0 ? void 0 : _a.push(parkingSpot);
        let parkingEvent = new ParkingEvent(ParkingEventType.Exit, parkingSpotEnum);
        this.displayService.update(parkingEvent);
        return parkingSpot;
    }
}
