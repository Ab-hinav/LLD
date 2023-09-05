export class DisplayBoard {
    constructor() {
        this.freeParkingSpots = new Map();
    }
    static getInstance() {
        if (!DisplayBoard.instance) {
            this.instance = new DisplayBoard();
        }
        return DisplayBoard.instance;
    }
    getFreeParkingSpots() {
        return this.freeParkingSpots;
    }
}
