"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ParkingSpotServiceImpl = void 0;
var ParkingLot_1 = require("../dto/ParkingLot");
var ParkingSpotEnumMapper_1 = require("../dto/ParkingSpotEnumMapper");
var DisplayServiceImpl_1 = require("./DisplayServiceImpl");
// import { DisplayService } from "interfaces/DisplayService";
var ParkingEventType_1 = require("../enums/ParkingEventType");
var ParkingEvent_1 = require("../dto/ParkingEvent");
var ParkingSpotServiceImpl = /** @class */ (function () {
    function ParkingSpotServiceImpl() {
        this.displayService = new DisplayServiceImpl_1.DisplayServiceImpl();
    }
    ParkingSpotServiceImpl.prototype.create = function (parkingSpotEnum, floor) {
        var _a;
        var parkingSpotEnumMapper = ParkingSpotEnumMapper_1.ParkingSpotEnumMapper.getInstance();
        var parkingSpotObj = parkingSpotEnumMapper.getParkingSpot(parkingSpotEnum);
        if (parkingSpotObj === null) {
            throw new Error("ParkingSpotEnum not found");
        }
        var parkingSpot = Object.create(parkingSpotObj);
        parkingSpot.floor = floor;
        (_a = ParkingLot_1.ParkingLot.getInstance("my parking lot").getFreeParkingSpots().get(parkingSpotEnum)) === null || _a === void 0 ? void 0 : _a.push(parkingSpot);
        var parkingEvent = new ParkingEvent_1.ParkingEvent(ParkingEventType_1.ParkingEventType.Exit, parkingSpotEnum);
        this.displayService.update(parkingEvent);
        return parkingSpot;
    };
    return ParkingSpotServiceImpl;
}());
exports.ParkingSpotServiceImpl = ParkingSpotServiceImpl;
