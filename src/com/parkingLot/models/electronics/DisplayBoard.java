package com.parkingLot.models.electronics;

import com.parkingLot.models.parking.interfaces.HasDisplay;

public class DisplayBoard extends Electronics implements HasDisplay {
    @Override
    public void showMessage(String message) {
        System.out.println("message");
    }
}
