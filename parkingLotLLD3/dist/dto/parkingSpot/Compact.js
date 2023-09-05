import { ParkingSpot } from "./ParkingSpot";
export class Compact extends ParkingSpot {
    constructor(floorNumber, amount) {
        super(floorNumber, amount);
    }
    cost(parkingHours) {
        return this.getAmount() * parkingHours;
    }
}
