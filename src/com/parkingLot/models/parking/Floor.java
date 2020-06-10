package com.parkingLot.models.parking;

import com.parkingLot.models.electronics.CustomerInfoPortal;
import com.parkingLot.models.electronics.DisplayBoard;
import com.parkingLot.models.parking.spots.Spot;

import java.util.List;

public class Floor {
    private CustomerInfoPortal customerInfoPortal;
    private List<Spot> spots;
    private DisplayBoard displayBoard;
}
