package org.example.Model;

public class Vehicle extends BaseEntity {

    String number;
    VehicleType type;

    public Vehicle() {
    }

    public Vehicle(String number, VehicleType type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public VehicleType getType() {
        return type;
    }


}
