import { ParkingEvent } from "../dto/ParkingEvent";



export interface Observer {

    update(parkingEvent:ParkingEvent):void;

}