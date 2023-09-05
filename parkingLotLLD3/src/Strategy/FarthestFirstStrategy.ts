import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";
import { Strategy } from "./Strategy";
import { ParkingSpot } from "../dto/parkingSpot/ParkingSpot";
import { SpotNotFoundException } from "../Exceptions/SpotNotFoundException";
import { ParkingLot } from "../dto/ParkingLot";




export class FarthestFirstStrategy implements Strategy {

    findParkingSpot(parkingSpotEnum: ParkingSpotEnum): ParkingSpot {
        
        let parkingSpots: ParkingSpot[]|undefined = ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum);

        let len =0;
        let ans : ParkingSpot|undefined = undefined;
        if (parkingSpots)
            parkingSpots.forEach(element => { 
                if (element){ len++
                        ans = element;
                }
            });

        if (ans)
            return ans;
        else
            throw new SpotNotFoundException();

    }

}
