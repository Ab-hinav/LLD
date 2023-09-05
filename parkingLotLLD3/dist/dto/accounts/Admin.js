import { ParkingLot } from "../ParkingLot";
import { Account } from "./Account";
export class Admin extends Account {
    constructor() {
        super(...arguments);
        this.parkingLot = ParkingLot.getInstance('myparkingLot');
    }
}
