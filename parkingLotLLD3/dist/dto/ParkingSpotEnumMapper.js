import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";
import { Compact } from "./parkingSpot/Compact";
import { Large } from "./parkingSpot/Large";
import { Mini } from "./parkingSpot/Mini";
// import { Mini } from "./parkingSpot/Mini";
// import { Large } from "./parkingSpot/Large";
// import { Compact } from "./parkingSpot/Compact";
export class ParkingSpotEnumMapper {
    constructor() {
    }
    getParkingSpot(ParkingSpotType) {
        if (ParkingSpotEnumMapper.mapper.has(ParkingSpotType)) {
            //@ts-ignore
            return ParkingSpotEnumMapper.mapper.get(ParkingSpotType);
        }
        return null;
    }
    setParkingSpot(ParkingSpotType, ParkingSpot) {
        ParkingSpotEnumMapper.mapper.set(ParkingSpotType, ParkingSpot);
    }
    static getInstance() {
        if (!ParkingSpotEnumMapper.instance) {
            ParkingSpotEnumMapper.instance = new ParkingSpotEnumMapper();
        }
        return ParkingSpotEnumMapper.instance;
    }
}
(() => {
    ParkingSpotEnumMapper.mapper = new Map();
    ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum.COMPACT, new Compact(0, 0));
    ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum.LARGE, new Large(0, 0));
    ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum.MINI, new Mini(0, 0));
})();
