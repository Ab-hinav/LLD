"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Car = void 0;
var ParkingSpotEnum_1 = require("../../enums/ParkingSpotEnum");
var Vehicle_1 = require("./Vehicle");
var ParkingSpotEnumMapper_1 = require("../ParkingSpotEnumMapper");
var Compact_1 = require("../parkingSpot/Compact");
// import { ParkingSpot } from "dto/parkingSpot/ParkingSpot";
var Car = /** @class */ (function (_super) {
    __extends(Car, _super);
    function Car() {
        var _this = _super.call(this, ParkingSpotEnum_1.ParkingSpotEnum.COMPACT) || this;
        ParkingSpotEnumMapper_1.ParkingSpotEnumMapper.getInstance().setParkingSpot(ParkingSpotEnum_1.ParkingSpotEnum.COMPACT, new Compact_1.Compact(0, 0));
        return _this;
    }
    return Car;
}(Vehicle_1.Vehicle));
exports.Car = Car;
