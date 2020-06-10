package com.parkingLot.models.parking;

import com.parkingLot.models.AutoExitPanel;
import com.parkingLot.models.DBObject;
import com.parkingLot.models.accounts.Attendant;
import com.parkingLot.models.parking.interfaces.PaymentEnabled;

public class Gate extends DBObject implements PaymentEnabled {
    private GateType type;
    public String gateName;

    private Attendant attendant;
    private AutoExitPanel exitPanel;

    void open() {

    }

    void close() {

    }

    void getTicket() {

    }

    @Override
    public void processTicket(Ticket ticket) {

    }
}
