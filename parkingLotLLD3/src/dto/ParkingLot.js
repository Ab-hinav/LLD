"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ParkingLot = void 0;
var DisplayBoard_1 = require("./DisplayBoard");
var ParkingLot = /** @class */ (function () {
    function ParkingLot(name) {
        this.name = name;
        this.entrances = [];
        this.exits = [];
        this.DisplayBoard = DisplayBoard_1.DisplayBoard.getInstance();
        this.freeParkingSpots = new Map();
        this.occupiedParkingSpots = new Map();
    }
    ParkingLot.getInstance = function (name) {
        if (!ParkingLot.parkingLot) {
            ParkingLot.parkingLot = new ParkingLot(name);
        }
        return ParkingLot.parkingLot;
    };
    ParkingLot.prototype.getName = function () {
        return this.name;
    };
    ParkingLot.prototype.setName = function (name) {
        this.name = name;
    };
    ParkingLot.prototype.getEntrances = function () {
        return this.entrances;
    };
    ParkingLot.prototype.setEntrances = function (entrances) {
        this.entrances = entrances;
    };
    ParkingLot.prototype.getExits = function () {
        return this.exits;
    };
    ParkingLot.prototype.setExits = function (exits) {
        this.exits = exits;
    };
    ParkingLot.prototype.getDisplayBoard = function () {
        return this.DisplayBoard;
    };
    ParkingLot.prototype.setDisplayBoard = function (displayBoard) {
        this.DisplayBoard = displayBoard;
    };
    ParkingLot.prototype.getFreeParkingSpots = function () {
        return this.freeParkingSpots;
    };
    ParkingLot.prototype.setFreeParkingSpots = function (freeParkingSpots) {
        this.freeParkingSpots = freeParkingSpots;
    };
    ParkingLot.prototype.getOccupiedParkingSpots = function () {
        return this.occupiedParkingSpots;
    };
    ParkingLot.prototype.setOccupiedParkingSpots = function (occupiedParkingSpots) {
        this.occupiedParkingSpots = occupiedParkingSpots;
    };
    return ParkingLot;
}());
exports.ParkingLot = ParkingLot;
