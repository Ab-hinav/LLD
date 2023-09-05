"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ParkingServiceImpl = void 0;
// import { error } from "console";
var ParkingLot_1 = require("../dto/ParkingLot");
var ParkingTicket_1 = require("../dto/ParkingTicket");
var DisplayServiceImpl_1 = require("./DisplayServiceImpl");
var InvalidTicketException_1 = require("../Exceptions/InvalidTicketException");
var ParkingEvent_1 = require("../dto/ParkingEvent");
var ParkingEventType_1 = require("../enums/ParkingEventType");
var Wash_1 = require("../dto/parkingSpot/SpotDecorator/Wash");
var ParkingServiceImpl = /** @class */ (function () {
    function ParkingServiceImpl(strategy) {
        this.strategy = strategy;
        this.parkingLot = ParkingLot_1.ParkingLot.getInstance("my parking lot");
        this.displayService = new DisplayServiceImpl_1.DisplayServiceImpl();
        this.observers = [];
    }
    ParkingServiceImpl.prototype.entry = function (vehicle) {
        var parkingSpotEnum = vehicle.getParkingSpotEnum();
        // @ts-ignore
        var freeParkingSpots = this.parkingLot.getFreeParkingSpots().get(parkingSpotEnum);
        // @ts-ignore
        var occupiedParkingSpots = this.parkingLot.getOccupiedParkingSpots().get(parkingSpotEnum);
        try {
            var parkingSpot = this.strategy.findParkingSpot(parkingSpotEnum);
            if (parkingSpot.getIsFree()) {
                parkingSpot.setIsFree(false);
                delete freeParkingSpots[parkingSpot.getId()];
                occupiedParkingSpots.push(parkingSpot);
                var parkingTicket = new ParkingTicket_1.ParkingTicket(vehicle, parkingSpot);
                var parkingEvent = new ParkingEvent_1.ParkingEvent(ParkingEventType_1.ParkingEventType.Entry, parkingSpotEnum);
                this.displayService.update(parkingEvent);
                this.notifyObservers(parkingEvent);
                return parkingTicket;
            }
        }
        catch (SpotNotFoundException) {
            throw SpotNotFoundException;
        }
        return null;
    };
    ParkingServiceImpl.prototype.addParkingSpotInFreeList = function (freeParkingSpots, parkingSpot) {
        if (freeParkingSpots) {
            freeParkingSpots.push(parkingSpot);
        }
    };
    ParkingServiceImpl.prototype.exit = function (parkingTicket, vehicle) {
        if (parkingTicket.getVehicle() === vehicle) {
            var parkingSpot = parkingTicket.getParkingSpot();
            var amount = parkingSpot.getAmount();
            parkingSpot.setIsFree(true);
            // @ts-ignore , this will not change the length of the array
            delete this.parkingLot.getOccupiedParkingSpots().get(vehicle.getParkingSpotEnum())[parkingSpot.getId()];
            var parkingEvent = new ParkingEvent_1.ParkingEvent(ParkingEventType_1.ParkingEventType.Exit, vehicle.getParkingSpotEnum());
            this.notifyObservers(parkingEvent);
            this.displayService.update(parkingEvent);
            this.addParkingSpotInFreeList(this.parkingLot.getFreeParkingSpots().get(vehicle.getParkingSpotEnum()), parkingSpot);
            return amount;
        }
        else {
            throw new InvalidTicketException_1.InvalidTicketException();
        }
    };
    ParkingServiceImpl.prototype.addObserver = function (observer) {
        this.observers.push(observer);
    };
    ParkingServiceImpl.prototype.notifyObservers = function (parkingEvent) {
        for (var _i = 0, _a = this.observers; _i < _a.length; _i++) {
            var observer = _a[_i];
            observer.update(parkingEvent);
        }
    };
    ParkingServiceImpl.prototype.addWash = function (parkingTicket) {
        parkingTicket.setParkingSpot(new Wash_1.Wash(parkingTicket.getParkingSpot()));
        return;
    };
    return ParkingServiceImpl;
}());
exports.ParkingServiceImpl = ParkingServiceImpl;
