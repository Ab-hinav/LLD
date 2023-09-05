import { DisplayBoard } from "./DisplayBoard";
export class ParkingLot {
    constructor(name) {
        this.name = name;
        this.entrances = [];
        this.exits = [];
        this.DisplayBoard = DisplayBoard.getInstance();
        this.freeParkingSpots = new Map();
        this.occupiedParkingSpots = new Map();
    }
    static getInstance(name) {
        if (!ParkingLot.parkingLot) {
            ParkingLot.parkingLot = new ParkingLot(name);
        }
        return ParkingLot.parkingLot;
    }
    getName() {
        return this.name;
    }
    setName(name) {
        this.name = name;
    }
    getEntrances() {
        return this.entrances;
    }
    setEntrances(entrances) {
        this.entrances = entrances;
    }
    getExits() {
        return this.exits;
    }
    setExits(exits) {
        this.exits = exits;
    }
    getDisplayBoard() {
        return this.DisplayBoard;
    }
    setDisplayBoard(displayBoard) {
        this.DisplayBoard = displayBoard;
    }
    getFreeParkingSpots() {
        return this.freeParkingSpots;
    }
    setFreeParkingSpots(freeParkingSpots) {
        this.freeParkingSpots = freeParkingSpots;
    }
    getOccupiedParkingSpots() {
        return this.occupiedParkingSpots;
    }
    setOccupiedParkingSpots(occupiedParkingSpots) {
        this.occupiedParkingSpots = occupiedParkingSpots;
    }
}
