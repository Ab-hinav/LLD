export class ParkingSpot {
    constructor(floorNumber, amount) {
        this.id = 0;
        this.floorNumber = 0;
        this.amount = 0;
        this.isFree = true;
        this.id = this.id + 1;
        this.floorNumber = floorNumber;
        this.amount = amount;
        this.isFree = true;
    }
    getId() {
        return this.id;
    }
    getFloorNumber() {
        return this.floorNumber;
    }
    getAmount() {
        return this.amount;
    }
    getIsFree() {
        return this.isFree;
    }
    setIsFree(isFree) {
        this.isFree = isFree;
    }
}
