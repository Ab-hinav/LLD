import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";
import { DisplayBoard } from "./DisplayBoard";
import { EntrancePanel } from "./EntrancePanel";
import { ExitPanel } from "./ExitPanel";
// import { Par/kingSpotEnumMapper } from "./ParkingSpotEnumMapper";
import { ParkingSpot } from "./parkingSpot/ParkingSpot";



export class ParkingLot {

    private name:String;
    private entrances:EntrancePanel[];
    private exits:ExitPanel[];
    private DisplayBoard:DisplayBoard;
    private freeParkingSpots:Map<ParkingSpotEnum,ParkingSpot[]>;
    private occupiedParkingSpots:Map<ParkingSpotEnum,ParkingSpot[]>;


    private static parkingLot:ParkingLot;

    private constructor(name:String){
        this.name = name;
        this.entrances = [];
        this.exits = [];
        this.DisplayBoard = DisplayBoard.getInstance();
        this.freeParkingSpots = new Map<ParkingSpotEnum,ParkingSpot[]>();
        this.occupiedParkingSpots = new Map<ParkingSpotEnum,ParkingSpot[]>();

    }

    public static getInstance(name:String):ParkingLot{
        if (!ParkingLot.parkingLot) {
            ParkingLot.parkingLot = new ParkingLot(name);
        }
        return ParkingLot.parkingLot;
    }


    public getName():String{
        return this.name;
    }

    public setName(name:String):void{
        this.name = name;
    }

    public getEntrances():EntrancePanel[]{
        return this.entrances;
    }

    public setEntrances(entrances:EntrancePanel[]):void{
        this.entrances = entrances;
    }

    public getExits():ExitPanel[]{
        return this.exits;
    }

    public setExits(exits:ExitPanel[]):void{
        this.exits = exits;
    }

    public getDisplayBoard():DisplayBoard{
        return this.DisplayBoard;
    }

    public setDisplayBoard(displayBoard:DisplayBoard):void{
        this.DisplayBoard = displayBoard;
    }

    public getFreeParkingSpots():Map<ParkingSpotEnum,ParkingSpot[]>{
        return this.freeParkingSpots;
    }

    public setFreeParkingSpots(freeParkingSpots:Map<ParkingSpotEnum,ParkingSpot[]>):void{
        this.freeParkingSpots = freeParkingSpots;
    }

    public getOccupiedParkingSpots():Map<ParkingSpotEnum,ParkingSpot[]>{
        return this.occupiedParkingSpots;
    }

    public setOccupiedParkingSpots(occupiedParkingSpots:Map<ParkingSpotEnum,ParkingSpot[]>):void{
        this.occupiedParkingSpots = occupiedParkingSpots;
    }





    



}