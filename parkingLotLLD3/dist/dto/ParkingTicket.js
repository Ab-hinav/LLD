export class ParkingTicket {
    /**
     * Getter $parkingSpot
     * @return {ParkingSpot}
     */
    getParkingSpot() {
        return this.parkingSpot;
    }
    /**
     * Setter $parkingSpot
     * @param {ParkingSpot} value
     */
    setParkingSpot(value) {
        this.parkingSpot = value;
    }
    constructor($vehicle, $parkingSpot) {
        this.id = 0;
        this.id = this.id + 1;
        this.vehicle = $vehicle;
        this.parkingSpot = $parkingSpot;
        this.entryTime = new Date();
    }
    /**
     * Getter $vehicle
     * @return {Vehicle}
     */
    getVehicle() {
        return this.vehicle;
    }
    /**
     * Setter $vehicle
     * @param {Vehicle} value
     */
    setVehicle(value) {
        this.vehicle = value;
    }
    getHoursSpent() {
        return 2;
    }
}
