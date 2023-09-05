import { ParkingSpotEnumMapper } from "../ParkingSpotEnumMapper";
import { ParkingSpotEnum } from "../../enums/ParkingSpotEnum";




export abstract class Vehicle {

    private id:number =0;
    private parkingSpotEnum:ParkingSpotEnum;

    private ParkingSpotEnumMapper:ParkingSpotEnumMapper|undefined;

   constructor(parkingSpotEnum:ParkingSpotEnum){
        this.parkingSpotEnum = parkingSpotEnum;
        this.ParkingSpotEnumMapper = ParkingSpotEnumMapper.getInstance();
        this.id = this.id+1;
    }

    public getId():number{
        return this.id;
    }

    public getParkingSpotEnumMapper():ParkingSpotEnumMapper |undefined{
        return this.ParkingSpotEnumMapper;
    }

    public setParkingSpotEnumMapper(ParkingSpotEnumMapper:ParkingSpotEnumMapper):void{
        this.ParkingSpotEnumMapper = ParkingSpotEnumMapper;
    }

    public getParkingSpotEnum():ParkingSpotEnum{
        return this.parkingSpotEnum;
    }






}