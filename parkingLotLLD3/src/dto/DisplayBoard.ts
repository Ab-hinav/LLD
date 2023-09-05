import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";




export class DisplayBoard {


    private static instance:DisplayBoard;
    private freeParkingSpots:Map<ParkingSpotEnum, Number>;

    private constructor(){
        this.freeParkingSpots = new Map<ParkingSpotEnum, Number>();
    }

    public static getInstance():DisplayBoard{
        if (!DisplayBoard.instance){
            this.instance = new DisplayBoard();
        }

        return DisplayBoard.instance;
    }

    public getFreeParkingSpots():Map<ParkingSpotEnum, Number>{
        return this.freeParkingSpots;
    } 

}