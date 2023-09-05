import { ParkingSpotEnumMapper } from "../ParkingSpotEnumMapper";
export class Vehicle {
    constructor(parkingSpotEnum) {
        this.id = 0;
        this.parkingSpotEnum = parkingSpotEnum;
        this.ParkingSpotEnumMapper = ParkingSpotEnumMapper.getInstance();
        this.id = this.id + 1;
    }
    getId() {
        return this.id;
    }
    getParkingSpotEnumMapper() {
        return this.ParkingSpotEnumMapper;
    }
    setParkingSpotEnumMapper(ParkingSpotEnumMapper) {
        this.ParkingSpotEnumMapper = ParkingSpotEnumMapper;
    }
    getParkingSpotEnum() {
        return this.parkingSpotEnum;
    }
}
