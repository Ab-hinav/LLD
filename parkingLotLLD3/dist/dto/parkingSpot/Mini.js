import { ParkingSpot } from "./ParkingSpot";
export class Mini extends ParkingSpot {
    constructor(floorNumber, amount) {
        super(floorNumber, amount);
    }
    cost(parkingHours) {
        return this.getAmount() * parkingHours;
    }
}
