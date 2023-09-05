import { ParkingSpotEnum } from "../enums/ParkingSpotEnum";
import { Compact } from "./parkingSpot/Compact";
import { Large } from "./parkingSpot/Large";
import { Mini } from "./parkingSpot/Mini";
import { ParkingSpot } from "./parkingSpot/ParkingSpot";
// import { Mini } from "./parkingSpot/Mini";
// import { Large } from "./parkingSpot/Large";
// import { Compact } from "./parkingSpot/Compact";



export class ParkingSpotEnumMapper {
    static mapper: Map<ParkingSpotEnum, ParkingSpot|null>;

    static instance: ParkingSpotEnumMapper;

    private constructor(){

    }

    getParkingSpot(ParkingSpotType:ParkingSpotEnum):ParkingSpot | null{
        if (ParkingSpotEnumMapper.mapper.has(ParkingSpotType)){
            //@ts-ignore
            return ParkingSpotEnumMapper.mapper.get(ParkingSpotType);
        }
        return null;
    }

    setParkingSpot(ParkingSpotType:ParkingSpotEnum, ParkingSpot:ParkingSpot|null):void{
        ParkingSpotEnumMapper.mapper.set(ParkingSpotType,ParkingSpot);
    }


    static {
        ParkingSpotEnumMapper.mapper = new Map<ParkingSpotEnum,ParkingSpot|null>();
        ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum.COMPACT,new Compact(0,0))
        ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum.LARGE,new Large(0,0))
        ParkingSpotEnumMapper.mapper.set(ParkingSpotEnum.MINI,new Mini(0,0));
    }

    static getInstance():ParkingSpotEnumMapper{
        if (!ParkingSpotEnumMapper.instance) {
            ParkingSpotEnumMapper.instance = new ParkingSpotEnumMapper();
        }
        
        return ParkingSpotEnumMapper.instance;
    }



}




