package org.example;

import org.example.Products.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManager {

    private List<Vehicle> vehicles;

    public VehicleInventoryManager(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public VehicleInventoryManager() {
        List<Vehicle> vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }






}
