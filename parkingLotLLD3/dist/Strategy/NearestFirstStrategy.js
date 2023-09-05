import { ParkingLot } from "../dto/ParkingLot";
import { SpotNotFoundException } from "../Exceptions/SpotNotFoundException";
export class NearestFirstStrategy {
    findParkingSpot(parkingSpotEnum) {
        let parkingSpots = ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum);
        let len = 0;
        let ans = undefined;
        if (parkingSpots)
            parkingSpots.forEach(element => {
                if (element) {
                    len++;
                    if (len == 1) {
                        ans = element;
                    }
                }
            });
        if (len <= 0)
            throw new SpotNotFoundException();
        if (ans)
            return ans;
        else
            throw new Error(" Something bad happened");
    }
}
