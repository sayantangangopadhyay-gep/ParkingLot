package com.parkingLot.models.vehicles;

import com.parkingLot.models.DBObject;

//abstract class cant be instantiated
public abstract class Vehicle extends DBObject {
    private String plateNumber;
    private String color;
    //we create this enum to avoid create multiple subclasses from vehicle class
    private final VehicleType type; //  vehicle type can't be changed

    public Vehicle(VehicleType type) {
        this.type = type;
    }
}
