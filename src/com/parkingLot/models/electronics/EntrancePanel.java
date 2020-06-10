package com.parkingLot.models.electronics;

import com.parkingLot.models.parking.Ticket;
import com.parkingLot.models.parking.interfaces.HasDisplay;
import com.parkingLot.models.parking.interfaces.IssueTicket;

public class EntrancePanel extends Electronics implements HasDisplay, IssueTicket {

    @Override
    public void showMessage(String message) {

    }

    @Override
    public Ticket giveTicket() {
        return null;
    }
}
