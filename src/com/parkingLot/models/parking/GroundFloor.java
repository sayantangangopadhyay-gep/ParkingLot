package com.parkingLot.models.parking;

import com.parkingLot.models.electronics.DisplayBoard;
import com.parkingLot.models.electronics.EntrancePanel;

public class GroundFloor extends Floor {
    private EntrancePanel entrancePanel;

    public EntrancePanel getEntrancePanel() {
        return entrancePanel;
    }

    public void setEntrancePanel(EntrancePanel entrancePanel) {
        this.entrancePanel = entrancePanel;
    }
}
