// import { ParkingSpotEnumMapper } from "dto/ParkingSpotEnumMapper";
import { ParkingSpot } from "../dto/parkingSpot/ParkingSpot";
import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";




export interface ParkingSpotService {

    create(parkingSpotEnum:ParkingSpotEnum,floor:number):ParkingSpot | null;



}