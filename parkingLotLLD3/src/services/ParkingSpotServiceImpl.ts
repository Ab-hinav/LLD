import { ParkingLot } from "../dto/ParkingLot";
import { ParkingSpotEnumMapper } from "../dto/ParkingSpotEnumMapper";
import { ParkingSpot } from "../dto/parkingSpot/ParkingSpot";
import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";
import { ParkingSpotService } from "../interfaces/ParkingSpotService";
import { DisplayServiceImpl } from "./DisplayServiceImpl";
// import { DisplayService } from "interfaces/DisplayService";
import { ParkingEventType } from "../enums/ParkingEventType";
import { ParkingEvent } from "../dto/ParkingEvent";




export class ParkingSpotServiceImpl implements ParkingSpotService{


    displayService:DisplayServiceImpl = new DisplayServiceImpl();
    
    create(parkingSpotEnum: ParkingSpotEnum, floor: number): ParkingSpot | null {
        
        let parkingSpotEnumMapper = ParkingSpotEnumMapper.getInstance();
        let parkingSpotObj = parkingSpotEnumMapper.getParkingSpot(parkingSpotEnum);
        if ( parkingSpotObj === null ) {
           throw new Error("ParkingSpotEnum not found");
        }

        let parkingSpot = Object.create(parkingSpotObj);
        parkingSpot.floor = floor;
        ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum)?.push(parkingSpot);
        let parkingEvent = new ParkingEvent(ParkingEventType.Exit,parkingSpotEnum);
        this.displayService.update(parkingEvent);

        return parkingSpot;

    }


    


}
