"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vehicle = void 0;
var ParkingSpotEnumMapper_1 = require("../ParkingSpotEnumMapper");
var Vehicle = /** @class */ (function () {
    function Vehicle(parkingSpotEnum) {
        this.id = 0;
        this.parkingSpotEnum = parkingSpotEnum;
        this.ParkingSpotEnumMapper = ParkingSpotEnumMapper_1.ParkingSpotEnumMapper.getInstance();
        this.id = this.id + 1;
    }
    Vehicle.prototype.getId = function () {
        return this.id;
    };
    Vehicle.prototype.getParkingSpotEnumMapper = function () {
        return this.ParkingSpotEnumMapper;
    };
    Vehicle.prototype.setParkingSpotEnumMapper = function (ParkingSpotEnumMapper) {
        this.ParkingSpotEnumMapper = ParkingSpotEnumMapper;
    };
    Vehicle.prototype.getParkingSpotEnum = function () {
        return this.parkingSpotEnum;
    };
    return Vehicle;
}());
exports.Vehicle = Vehicle;
