import { SpotNotFoundException } from "../Exceptions/SpotNotFoundException";
import { ParkingLot } from "../dto/ParkingLot";
export class FarthestFirstStrategy {
    findParkingSpot(parkingSpotEnum) {
        let parkingSpots = ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum);
        let len = 0;
        let ans = undefined;
        if (parkingSpots)
            parkingSpots.forEach(element => {
                if (element) {
                    len++;
                    ans = element;
                }
            });
        if (ans)
            return ans;
        else
            throw new SpotNotFoundException();
    }
}
