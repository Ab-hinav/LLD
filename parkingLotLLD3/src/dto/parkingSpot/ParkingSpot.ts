




export abstract class ParkingSpot {

    private id:number =0;
    private floorNumber:number =0;
    private amount:number =0;
    private isFree:boolean=true;

    constructor( floorNumber:number, amount:number){
        this.id = this.id+1;
        this.floorNumber = floorNumber;
        this.amount = amount;
        this.isFree = true;
    }

    public getId():number{
        return this.id;
    }

    public getFloorNumber():number{
        return this.floorNumber;
    }

    public getAmount():number{
        return this.amount;
    }

    public getIsFree():boolean{
        return this.isFree;
    }

    public setIsFree(isFree:boolean):void{
        this.isFree = isFree;
    }

    public abstract cost(parkingHours:number):number;

}