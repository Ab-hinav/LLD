import { ParkingSpot } from "./ParkingSpot";
export class Large extends ParkingSpot {
    constructor(floorNumber, amount) {
        super(floorNumber, amount);
    }
    cost(parkingHours) {
        return this.getAmount() * parkingHours;
    }
}
