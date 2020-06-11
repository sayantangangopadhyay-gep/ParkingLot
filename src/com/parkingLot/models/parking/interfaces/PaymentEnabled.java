package com.parkingLot.models.parking.interfaces;

import com.parkingLot.models.parking.Ticket;

public interface PaymentEnabled {
    public void processTicket(Ticket ticket);
    public void processPayment();
}
