package com.parkingLot.models.parking;

import com.parkingLot.models.Attendant;
import com.parkingLot.models.AutoExitPanel;
import com.parkingLot.models.DBObject;

public class Gate extends DBObject {
    private GateType type;
    public String gateName;

    private Attendant attendant;
    private AutoExitPanel exitPanel;

    void open(){

    }
    void close(){

    }
}
