package org.example.Model;

public class FourWheelerSpot extends ParkingSpot{

    private VehicleType type;
    public FourWheelerSpot(boolean isFree, double price) {
        super(isFree, price);
        this.type = VehicleType.FOURWHEELER;
    }
}
