// import { get } from "http";
import { ParkingSpot } from "./parkingSpot/ParkingSpot";
import { Vehicle } from "./vehicle/Vehicle";




export class ParkingTicket {

    private id:number =0;
    private vehicle:Vehicle;
    private parkingSpot:ParkingSpot;
    private entryTime:Date;



    /**
     * Getter $parkingSpot
     * @return {ParkingSpot}
     */
	public getParkingSpot(): ParkingSpot {
		return this.parkingSpot;
	}

    /**
     * Setter $parkingSpot
     * @param {ParkingSpot} value
     */
	public setParkingSpot(value: ParkingSpot) {
		this.parkingSpot = value;
	}
	constructor( $vehicle: Vehicle, $parkingSpot: ParkingSpot) {
		this.id = this.id+1;
		this.vehicle = $vehicle;
		this.parkingSpot = $parkingSpot;
		this.entryTime = new Date();
	}

    /**
     * Getter $vehicle
     * @return {Vehicle}
     */
	public getVehicle(): Vehicle {
		return this.vehicle;
	}

    /**
     * Setter $vehicle
     * @param {Vehicle} value
     */
	public setVehicle(value: Vehicle) {
		this.vehicle = value;
	}
     

    public getHoursSpent():number{
        return 2;
    }



}