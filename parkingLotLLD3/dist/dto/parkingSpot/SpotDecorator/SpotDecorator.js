import { ParkingSpot } from "../ParkingSpot";
export class SpotDecorator extends ParkingSpot {
    constructor(parkingSpot) {
        super(0, 0);
        this.parkingSpot = parkingSpot;
    }
}
