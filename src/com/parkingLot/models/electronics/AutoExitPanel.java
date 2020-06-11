package com.parkingLot.models.electronics;

import com.parkingLot.models.parking.Ticket;
import com.parkingLot.models.parking.interfaces.PaymentEnabled;

public class AutoExitPanel extends  Electronics implements PaymentEnabled {
    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }
}
