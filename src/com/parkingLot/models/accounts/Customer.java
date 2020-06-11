package com.parkingLot.models.accounts;

import com.parkingLot.models.parking.Ticket;
import com.parkingLot.models.people.Person;

public class Customer extends Account {
    public Customer(String userName, String saltedPasswordHash, Person person) {
        super(userName, saltedPasswordHash, person);
    }

    public Ticket getTicket(){
        return null;
    }

    public void payForTicket(Ticket ticket){

    }
}
