package com.parkingLot.models.parking.spots;

public abstract class Spot {
    private final SpotType type;
    private SpotStatus status;

    public Spot(SpotType type) {
        this.type = type;
    }
}
