package org.example.Model;

public class TwoWheelerSpot extends ParkingSpot {

    private VehicleType type;
    public TwoWheelerSpot( boolean isFree, double price) {
        super( isFree, price);
        this.type = VehicleType.TWOWHEELER;
    }
}
