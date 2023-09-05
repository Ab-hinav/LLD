"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.DisplayServiceImpl = void 0;
var DisplayBoard_1 = require("../dto/DisplayBoard");
var ParkingEventType_1 = require("../enums/ParkingEventType");
var DisplayServiceImpl = /** @class */ (function () {
    function DisplayServiceImpl() {
    }
    // update(parkingSpotEnum: ParkingSpotEnum, change: number): void {
    //     let currentCount = DisplayBoard.getInstance().getFreeParkingSpots().get(parkingSpotEnum);
    //     // @ts-ignore
    //     currentCount = currentCount + change;
    //     // @ts-ignore
    //     DisplayBoard.getInstance().getFreeParkingSpots().set(parkingSpotEnum, currentCount);
    // }
    DisplayServiceImpl.prototype.update = function (parkingEvent) {
        var currentCount = DisplayBoard_1.DisplayBoard.getInstance().getFreeParkingSpots().get(parkingEvent.parkingSpotEnum);
        var change = 0;
        if (parkingEvent.parkingEventType === ParkingEventType_1.ParkingEventType.Entry) {
            change = -1;
        }
        else {
            change = 1;
        }
        // @ts-ignore
        DisplayBoard_1.DisplayBoard.getInstance().getFreeParkingSpots().set(parkingEvent.parkingSpotEnum, currentCount + change);
    };
    return DisplayServiceImpl;
}());
exports.DisplayServiceImpl = DisplayServiceImpl;
