// import { error } from "console";
import { ParkingLot } from "../dto/ParkingLot";
import { ParkingTicket } from "../dto/ParkingTicket";
import { DisplayServiceImpl } from "./DisplayServiceImpl";
import { InvalidTicketException } from "../Exceptions/InvalidTicketException";
import { ParkingEvent } from "../dto/ParkingEvent";
import { ParkingEventType } from "../enums/ParkingEventType";
import { Wash } from "../dto/parkingSpot/SpotDecorator/Wash";
export class ParkingServiceImpl {
    constructor(strategy) {
        this.strategy = strategy;
        this.parkingLot = ParkingLot.getInstance("my parking lot");
        this.displayService = new DisplayServiceImpl();
        this.observers = [];
    }
    entry(vehicle) {
        let parkingSpotEnum = vehicle.getParkingSpotEnum();
        // @ts-ignore
        let freeParkingSpots = this.parkingLot.getFreeParkingSpots().get(parkingSpotEnum);
        // @ts-ignore
        let occupiedParkingSpots = this.parkingLot.getOccupiedParkingSpots().get(parkingSpotEnum);
        try {
            let parkingSpot = this.strategy.findParkingSpot(parkingSpotEnum);
            if (parkingSpot.getIsFree()) {
                parkingSpot.setIsFree(false);
                delete freeParkingSpots[parkingSpot.getId()];
                occupiedParkingSpots.push(parkingSpot);
                let parkingTicket = new ParkingTicket(vehicle, parkingSpot);
                let parkingEvent = new ParkingEvent(ParkingEventType.Entry, parkingSpotEnum);
                this.displayService.update(parkingEvent);
                this.notifyObservers(parkingEvent);
                return parkingTicket;
            }
        }
        catch (SpotNotFoundException) {
            throw SpotNotFoundException;
        }
        return null;
    }
    addParkingSpotInFreeList(freeParkingSpots, parkingSpot) {
        if (freeParkingSpots) {
            freeParkingSpots.push(parkingSpot);
        }
    }
    exit(parkingTicket, vehicle) {
        if (parkingTicket.getVehicle() === vehicle) {
            let parkingSpot = parkingTicket.getParkingSpot();
            let amount = parkingSpot.getAmount();
            parkingSpot.setIsFree(true);
            // @ts-ignore , this will not change the length of the array
            delete this.parkingLot.getOccupiedParkingSpots().get(vehicle.getParkingSpotEnum())[parkingSpot.getId()];
            let parkingEvent = new ParkingEvent(ParkingEventType.Exit, vehicle.getParkingSpotEnum());
            this.notifyObservers(parkingEvent);
            this.displayService.update(parkingEvent);
            this.addParkingSpotInFreeList(this.parkingLot.getFreeParkingSpots().get(vehicle.getParkingSpotEnum()), parkingSpot);
            return amount;
        }
        else {
            throw new InvalidTicketException();
        }
    }
    addObserver(observer) {
        this.observers.push(observer);
    }
    notifyObservers(parkingEvent) {
        for (let observer of this.observers) {
            observer.update(parkingEvent);
        }
    }
    addWash(parkingTicket) {
        parkingTicket.setParkingSpot(new Wash(parkingTicket.getParkingSpot()));
        return;
    }
}
