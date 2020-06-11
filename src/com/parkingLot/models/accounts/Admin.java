package com.parkingLot.models.accounts;

import com.parkingLot.models.electronics.Electronics;
import com.parkingLot.models.parking.Floor;
import com.parkingLot.models.parking.Gate;
import com.parkingLot.models.parking.spots.Spot;
import com.parkingLot.models.people.Person;

public class Admin extends Account {
    public Admin(String userName, String saltedPasswordHash, Person person) {
        super(userName, saltedPasswordHash, person);
    }

    void addFloor(Floor floor){

    }
    void removeFloor(Floor floor){

    }
    void updateFloor(Floor floor){

    }

    void addGate(Gate gate){

    }
    void removeGate(Gate gate){

    }
    void updateGate(Gate gate){

    }

    void addSpot(Floor floor , Spot spot){

    }
    void removeSpot(Floor floor , Spot spot){

    }
    void updateSpot(Floor floor , Spot spot){

    }

    void addElectronics(Floor floor , Electronics panel){

    }
    void removeElectronics(Floor floor , Electronics panel){

    }
    void updateElectronics(Floor floor , Electronics panel){

    }

    void addAttendant(Floor floor , Attendant attendant){

    }
    void removeAttendant(Floor floor , Attendant attendant){

    }
    void updateAttendant(Floor floor , Attendant attendant){

    }
}
