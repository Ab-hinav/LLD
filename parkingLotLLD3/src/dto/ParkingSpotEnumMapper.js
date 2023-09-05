"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ParkingSpotEnumMapper = void 0;
var ParkingSpotEnum_1 = require("../enums/ParkingSpotEnum");
var Compact_1 = require("./parkingSpot/Compact");
var Large_1 = require("./parkingSpot/Large");
var Mini_1 = require("./parkingSpot/Mini");
// import { Mini } from "./parkingSpot/Mini";
// import { Large } from "./parkingSpot/Large";
// import { Compact } from "./parkingSpot/Compact";
var ParkingSpotEnumMapper = /** @class */ (function () {
    function ParkingSpotEnumMapper() {
    }
    ParkingSpotEnumMapper.prototype.getParkingSpot = function (ParkingSpotType) {
        if (ParkingSpotEnumMapper.mapper.has(ParkingSpotType)) {
            //@ts-ignore
            return ParkingSpotEnumMapper.mapper.get(ParkingSpotType);
        }
        return null;
    };
    ParkingSpotEnumMapper.prototype.setParkingSpot = function (ParkingSpotType, ParkingSpot) {
        ParkingSpotEnumMapper.mapper.set(ParkingSpotType, ParkingSpot);
    };
    ParkingSpotEnumMapper.getInstance = function () {
        if (!ParkingSpotEnumMapper.instance) {
            ParkingSpotEnumMapper.instance = new ParkingSpotEnumMapper();
        }
        return ParkingSpotEnumMapper.instance;
    };
    return ParkingSpotEnumMapper;
}());
exports.ParkingSpotEnumMapper = ParkingSpotEnumMapper;
(function () {
    ParkingSpotEnumMapper.mapper = new Map();
    ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum_1.ParkingSpotEnum.COMPACT, new Compact_1.Compact(0, 0));
    ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum_1.ParkingSpotEnum.LARGE, new Large_1.Large(0, 0));
    ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum_1.ParkingSpotEnum.MINI, new Mini_1.Mini(0, 0));
})();
