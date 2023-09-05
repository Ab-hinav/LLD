import { ParkingSpot } from "./ParkingSpot";





export class Compact extends ParkingSpot{

    constructor(floorNumber:number, amount:number){
        super(floorNumber, amount);
    }
    
    public cost(parkingHours:number):number {
        return this.getAmount() * parkingHours;
    }

}