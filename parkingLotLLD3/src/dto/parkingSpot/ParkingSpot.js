"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ParkingSpot = void 0;
var ParkingSpot = /** @class */ (function () {
    function ParkingSpot(floorNumber, amount) {
        this.id = 0;
        this.floorNumber = 0;
        this.amount = 0;
        this.isFree = true;
        this.id = this.id + 1;
        this.floorNumber = floorNumber;
        this.amount = amount;
        this.isFree = true;
    }
    ParkingSpot.prototype.getId = function () {
        return this.id;
    };
    ParkingSpot.prototype.getFloorNumber = function () {
        return this.floorNumber;
    };
    ParkingSpot.prototype.getAmount = function () {
        return this.amount;
    };
    ParkingSpot.prototype.getIsFree = function () {
        return this.isFree;
    };
    ParkingSpot.prototype.setIsFree = function (isFree) {
        this.isFree = isFree;
    };
    return ParkingSpot;
}());
exports.ParkingSpot = ParkingSpot;
