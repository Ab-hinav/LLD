import { SpotDecorator } from "./SpotDecorator";
export class Electric extends SpotDecorator {
    constructor(parkingSpot) {
        super(parkingSpot);
    }
    cost(parkingHours) {
        return this.parkingSpot.cost(parkingHours) + 20;
    }
}
