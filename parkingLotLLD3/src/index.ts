

// make a parking lot service instantiate it and call 
// the createParkingLot method with the number of slots


// how to take user input ?


import { FarthestFirstStrategy } from './Strategy/FarthestFirstStrategy';
import { ParkingLot } from './dto/ParkingLot';
import { ParkingTicket } from './dto/ParkingTicket';
import { ParkingSpot } from './dto/parkingSpot/ParkingSpot';
import { Car } from './dto/vehicle/Car';
import { Vehicle } from './dto/vehicle/Vehicle';
import { ParkingSpotEnum } from './enums/ParkingSpotEnum';
import { ParkingSpotService } from './interfaces/ParkingSpotService';
import { PaymentService } from './interfaces/PaymentService';
import * as readline from 'readline/promises';
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
    
    let parkingLot:ParkingLot = ParkingLot.getInstance("my parking lot");
    let parkingSpotService:ParkingSpotService = new ParkingSpotServiceImpl();

    parkingSpotService.create(ParkingSpotEnum.COMPACT,0);
    parkingSpotService.create(ParkingSpotEnum.COMPACT,1);

    parkingSpotService.create(ParkingSpotEnum.LARGE,0);
    parkingSpotService.create(ParkingSpotEnum.LARGE,1);

    parkingSpotService.create(ParkingSpotEnum.MINI,0);
    parkingSpotService.create(ParkingSpotEnum.MINI,1);

    let vehicle:Vehicle = new Car();
    let vehicle2:Vehicle = new Car();
    let vehicle3:Vehicle = new Car();

    let parkingServiceImpl:ParkingServiceImpl = new ParkingServiceImpl(new FarthestFirstStrategy());
    let PaymentService:PaymentService = new PaymentServiceImpl();
    console.log('fdsf');
    let parkingTicket:ParkingTicket|null = parkingServiceImpl.entry(vehicle);
    console.log("parking ticket is: ",parkingTicket);
    console.log("parking ticket is: ",parkingTicket?.getVehicle().getId());
    



        
   
}catch(e){

    console.log(e);
}
