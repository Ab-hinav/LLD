"use strict";
// make a parking lot service instantiate it and call 
// the createParkingLot method with the number of slots
Object.defineProperty(exports, "__esModule", { value: true });
// how to take user input ?
var FarthestFirstStrategy_1 = require("./Strategy/FarthestFirstStrategy");
var ParkingLot_1 = require("./dto/ParkingLot");
var Car_1 = require("./dto/vehicle/Car");
var ParkingSpotEnum_1 = require("./enums/ParkingSpotEnum");
var ParkingServiceImpl_1 = require("./services/ParkingServiceImpl");
var ParkingSpotServiceImpl_1 = require("./services/ParkingSpotServiceImpl");
var PaymentServiceImpl_1 = require("./services/PaymentServiceImpl");
// const rl = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
try {
    // NOTE: the second parameter (the timeout) is optional.
    // const answer = await rl.question('', {
    // // 10s timeout
    // });
    var parkingLot = ParkingLot_1.ParkingLot.getInstance("my parking lot");
    var parkingSpotService = new ParkingSpotServiceImpl_1.ParkingSpotServiceImpl();
    parkingSpotService.create(ParkingSpotEnum_1.ParkingSpotEnum.COMPACT, 0);
    parkingSpotService.create(ParkingSpotEnum_1.ParkingSpotEnum.COMPACT, 1);
    parkingSpotService.create(ParkingSpotEnum_1.ParkingSpotEnum.LARGE, 0);
    parkingSpotService.create(ParkingSpotEnum_1.ParkingSpotEnum.LARGE, 1);
    parkingSpotService.create(ParkingSpotEnum_1.ParkingSpotEnum.MINI, 0);
    parkingSpotService.create(ParkingSpotEnum_1.ParkingSpotEnum.MINI, 1);
    var vehicle = new Car_1.Car();
    var vehicle2 = new Car_1.Car();
    var vehicle3 = new Car_1.Car();
    var parkingServiceImpl = new ParkingServiceImpl_1.ParkingServiceImpl(new FarthestFirstStrategy_1.FarthestFirstStrategy());
    var PaymentService = new PaymentServiceImpl_1.PaymentServiceImpl();
    console.log('fdsf');
    var parkingTicket = parkingServiceImpl.entry(vehicle);
    console.log("parking ticket is: ", parkingTicket);
    console.log("parking ticket is: ", parkingTicket === null || parkingTicket === void 0 ? void 0 : parkingTicket.getVehicle().getId());
}
catch (e) {
    console.log(e);
}
