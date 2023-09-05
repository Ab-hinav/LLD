import { DisplayBoard } from "../dto/DisplayBoard";
import { ParkingEventType } from "../enums/ParkingEventType";
export class DisplayServiceImpl {
    // update(parkingSpotEnum: ParkingSpotEnum, change: number): void {
    //     let currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(parkingSpotEnum);
    //     // @ts-ignore
    //     currentCount = currentCount + change;
    //     // @ts-ignore
    //     DisplayBoard.getInstance().getFreeParkingSpots().set(parkingSpotEnum, currentCount);
    // }
    update(parkingEvent) {
        let currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(parkingEvent.parkingSpotEnum);
        let change = 0;
        if (parkingEvent.parkingEventType === ParkingEventType.Entry) {
            change = -1;
        }
        else {
            change = 1;
        }
        // @ts-ignore
        DisplayBoard.getInstance().getFreeParkingSpots().set(parkingEvent.parkingSpotEnum, currentCount + change);
    }
}
