package com.parkingLot.models.parking.spots;

import com.parkingLot.models.electronics.ChargingPanel;

public class ElectricSpot extends Spot {
    private ChargingPanel chargingPanel;

    public ElectricSpot() {
        super(SpotType.ELECTRIC);
    }
}
