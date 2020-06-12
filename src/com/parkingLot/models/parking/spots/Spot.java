package com.parkingLot.models.parking.spots;

import com.parkingLot.exceptions.MalformedVehicleException;
import com.parkingLot.exceptions.SpotAlreadyFreeException;
import com.parkingLot.exceptions.SpotAlreadyOccupiedException;
import com.parkingLot.models.DBObject;
import com.parkingLot.models.vehicles.Vehicle;

public abstract class Spot extends DBObject {
    private final SpotType type;
    private SpotStatus status;
    private Vehicle vehicle;

    public Spot(SpotType type) {
        this.type = type;
    }

    public SpotType getType() {
        return type;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }

    public void park(Vehicle vehicle) throws SpotAlreadyOccupiedException, MalformedVehicleException {
        if(!status.equals(SpotStatus.FREE)){
            throw new SpotAlreadyOccupiedException(this.toString() + " is already occupied: ");
        }

        if(!vehicle.getType().getFitsIn().contains(this.getType())) { //this.getType() is current spot type
            throw new MalformedVehicleException(vehicle.getType().toString() + " doesnot fits in: " + this.toString());
        }
        this.vehicle = vehicle;
        this.status = SpotStatus.OCCUPIED;
    }
    public Vehicle unPark() throws SpotAlreadyFreeException {
        if(!status.equals(SpotStatus.OCCUPIED)){
            throw new SpotAlreadyFreeException(this.toString() + " is already free: ");
        }
        Vehicle vehicle = this.vehicle;
        this.vehicle = null;
        status = SpotStatus.FREE;
        return vehicle;
    }

    @Override
    public String toString() {
        return "Spot{" +
                "type=" + type +
                ", status=" + status +
                ", vehicle=" + vehicle +
                '}';
    }
}
