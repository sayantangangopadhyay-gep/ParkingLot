package com.parkingLot.models.parking;

import com.parkingLot.models.electronics.AutoExitPanel;
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

    @Override
    public void processPayment() {

    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }

    public Attendant getAttendant() {
        return attendant;
    }

    public void setAttendant(Attendant attendant) {
        this.attendant = attendant;
    }

    public AutoExitPanel getExitPanel() {
        return exitPanel;
    }

    public void setExitPanel(AutoExitPanel exitPanel) {
        this.exitPanel = exitPanel;
    }
}
