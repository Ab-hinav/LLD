import { DisplayBoard } from "../dto/DisplayBoard";
import { ParkingEvent } from "../dto/ParkingEvent";
import { ParkingEventType } from "../enums/ParkingEventType";
// import { ParkingSpotEnum } from "enums/ParkingSpotEnum";
import { DisplayService } from "../interfaces/DisplayService";
import { Observer } from "../interfaces/Observer";





export class DisplayServiceImpl implements DisplayService,Observer{


    // update(parkingSpotEnum: ParkingSpotEnum, change: number): void {
    //     let currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(parkingSpotEnum);
    //     // @ts-ignore
    //     currentCount = currentCount + change;
    //     // @ts-ignore
    //     DisplayBoard.getInstance().getFreeParkingSpots().set(parkingSpotEnum, currentCount);
    // }

    update(parkingEvent:ParkingEvent){
        let currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(parkingEvent.parkingSpotEnum);
        let change = 0;
        if (parkingEvent.parkingEventType === ParkingEventType.Entry){
            change = -1;
        }else {
            change = 1;
        }
        // @ts-ignore
        DisplayBoard.getInstance().getFreeParkingSpots().set(parkingEvent.parkingSpotEnum, currentCount + change);
    }

}