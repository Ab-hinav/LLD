import { ParkingTicket } from "../dto/ParkingTicket";
import { Vehicle } from "../dto/vehicle/Vehicle";






export interface ParkingService{

    entry(vehicle:Vehicle):ParkingTicket | null;
    exit(parkingTicket:ParkingTicket,vehicle:Vehicle):void;

}