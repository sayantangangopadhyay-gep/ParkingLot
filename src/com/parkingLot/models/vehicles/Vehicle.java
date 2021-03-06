package com.parkingLot.models.vehicles;

import com.parkingLot.models.DBObject;
import com.parkingLot.models.parking.Ticket;

//abstract class cant be instantiated
public abstract class Vehicle extends DBObject {
    private String plateNumber;
    private String color;
    //we create this enum to avoid create multiple subclasses from vehicle class
    private final VehicleType type; //  vehicle type can't be changed

    private Ticket ticket;

    public Vehicle(VehicleType type) {
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getType() {
        return type;
    }

    public Ticket showTicket(){
        return ticket;
    }
    public void assignTicket(Ticket ticket){
        this.ticket = ticket;
    }
}
