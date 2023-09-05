import { ParkingLot } from "../ParkingLot";
import { Account } from "./Account";



export class Admin extends Account{
    
    private parkingLot :ParkingLot = ParkingLot.getInstance('myparkingLot');


}