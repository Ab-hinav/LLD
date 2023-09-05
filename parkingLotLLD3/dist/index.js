// make a parking lot service instantiate it and call 
// the createParkingLot method with the number of slots
// how to take user input ?
import { FarthestFirstStrategy } from './Strategy/FarthestFirstStrategy';
import { ParkingLot } from './dto/ParkingLot';
import { Car } from './dto/vehicle/Car';
import { ParkingSpotEnum } from './enums/ParkingSpotEnum';
import { ParkingServiceImpl } from './services/ParkingServiceImpl';
import { ParkingSpotServiceImpl } from './services/ParkingSpotServiceImpl';
import { PaymentServiceImpl } from './services/PaymentServiceImpl';
// const rl = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
try {
    // NOTE: the second parameter (the timeout) is optional.
    // const answer = await rl.question('', {
    // // 10s timeout
    // });
    let parkingLot = ParkingLot.getInstance("my parking lot");
    let parkingSpotService = new ParkingSpotServiceImpl();
    parkingSpotService.create(ParkingSpotEnum.COMPACT, 0);
    parkingSpotService.create(ParkingSpotEnum.COMPACT, 1);
    parkingSpotService.create(ParkingSpotEnum.LARGE, 0);
    parkingSpotService.create(ParkingSpotEnum.LARGE, 1);
    parkingSpotService.create(ParkingSpotEnum.MINI, 0);
    parkingSpotService.create(ParkingSpotEnum.MINI, 1);
    let vehicle = new Car();
    let vehicle2 = new Car();
    let vehicle3 = new Car();
    let parkingServiceImpl = new ParkingServiceImpl(new FarthestFirstStrategy());
    let PaymentService = new PaymentServiceImpl();
    console.log('fdsf');
    let parkingTicket = parkingServiceImpl.entry(vehicle);
    console.log("parking ticket is: ", parkingTicket);
    console.log("parking ticket is: ", parkingTicket === null || parkingTicket === void 0 ? void 0 : parkingTicket.getVehicle().getId());
}
catch (e) {
    console.log(e);
}
