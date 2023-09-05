import { ParkingSpot } from "../ParkingSpot";




export abstract class SpotDecorator extends ParkingSpot {


    protected parkingSpot:ParkingSpot;

    constructor(parkingSpot:ParkingSpot){
        super(0,0);
        this.parkingSpot = parkingSpot;
    }

}