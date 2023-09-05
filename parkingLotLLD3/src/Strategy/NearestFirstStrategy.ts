import { ParkingSpot } from "../dto/parkingSpot/ParkingSpot";
import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";
import { Strategy } from "./Strategy";
import { ParkingLot } from "../dto/ParkingLot";
import { SpotNotFoundException } from "../Exceptions/SpotNotFoundException";



export class NearestFirstStrategy implements Strategy {

    findParkingSpot(parkingSpotEnum: ParkingSpotEnum): ParkingSpot {

        let parkingSpots: ParkingSpot[]|undefined = ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum);

        let len =0;
        let ans : ParkingSpot|undefined = undefined;
        if (parkingSpots)
            parkingSpots.forEach(element => { 
                if (element){ len++
                    if (len == 1){
                        ans = element;
                    }
                }
            });
        
        if (len<=0)
            throw new SpotNotFoundException();
        if (ans)
            return ans;
        else 
            throw new Error(" Something bad happened")    

    }

}
