package com.parkingLot.models.parking.spots;

import com.parkingLot.models.vehicles.Vehicle;

public abstract class Spot {
    private final SpotType type;
    private SpotStatus status;

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

    public void park(Vehicle vehicle){

    }
}
