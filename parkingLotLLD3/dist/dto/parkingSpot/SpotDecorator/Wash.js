import { SpotDecorator } from "./SpotDecorator";
export class Wash extends SpotDecorator {
    constructor(parkingSpot) {
        super(parkingSpot);
    }
    cost(parkingHours) {
        return this.parkingSpot.cost(parkingHours) + 50;
    }
}
