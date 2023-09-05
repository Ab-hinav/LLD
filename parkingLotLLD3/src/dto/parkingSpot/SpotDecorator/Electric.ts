import { ParkingSpot } from "../ParkingSpot";
import { SpotDecorator } from "./SpotDecorator";





export class Electric extends SpotDecorator {
    constructor(parkingSpot:ParkingSpot){
        super(parkingSpot);
    }

    public cost(parkingHours: number): number {
        return this.parkingSpot.cost(parkingHours) + 20;
    }

}