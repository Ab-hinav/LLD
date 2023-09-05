"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FarthestFirstStrategy = void 0;
var SpotNotFoundException_1 = require("../Exceptions/SpotNotFoundException");
var ParkingLot_1 = require("../dto/ParkingLot");
var FarthestFirstStrategy = /** @class */ (function () {
    function FarthestFirstStrategy() {
    }
    FarthestFirstStrategy.prototype.findParkingSpot = function (parkingSpotEnum) {
        var parkingSpots = ParkingLot_1.ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum);
        var len = 0;
        var ans = undefined;
        if (parkingSpots)
            parkingSpots.forEach(function (element) {
                if (element) {
                    len++;
                    ans = element;
                }
            });
        if (ans)
            return ans;
        else
            throw new SpotNotFoundException_1.SpotNotFoundException();
    };
    return FarthestFirstStrategy;
}());
exports.FarthestFirstStrategy = FarthestFirstStrategy;
