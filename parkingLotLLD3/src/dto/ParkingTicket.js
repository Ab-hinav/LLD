"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ParkingTicket = void 0;
var ParkingTicket = /** @class */ (function () {
    function ParkingTicket($vehicle, $parkingSpot) {
        this.id = 0;
        this.id = this.id + 1;
        this.vehicle = $vehicle;
        this.parkingSpot = $parkingSpot;
        this.entryTime = new Date();
    }
    /**
     * Getter $parkingSpot
     * @return {ParkingSpot}
     */
    ParkingTicket.prototype.getParkingSpot = function () {
        return this.parkingSpot;
    };
    /**
     * Setter $parkingSpot
     * @param {ParkingSpot} value
     */
    ParkingTicket.prototype.setParkingSpot = function (value) {
        this.parkingSpot = value;
    };
    /**
     * Getter $vehicle
     * @return {Vehicle}
     */
    ParkingTicket.prototype.getVehicle = function () {
        return this.vehicle;
    };
    /**
     * Setter $vehicle
     * @param {Vehicle} value
     */
    ParkingTicket.prototype.setVehicle = function (value) {
        this.vehicle = value;
    };
    ParkingTicket.prototype.getHoursSpent = function () {
        return 2;
    };
    return ParkingTicket;
}());
exports.ParkingTicket = ParkingTicket;
