package com.parkingLot.models.accounts;

import com.parkingLot.models.parking.Ticket;
import com.parkingLot.models.parking.interfaces.IssueTicket;
import com.parkingLot.models.parking.interfaces.PaymentEnabled;
import com.parkingLot.models.people.Person;

public class Attendant extends Account implements IssueTicket, PaymentEnabled {
    public Attendant(String userName, String saltedPasswordHash, Person person) {
        super(userName, saltedPasswordHash, person);
    }

    @Override
    public Ticket giveTicket() {
        return null;
    }

    @Override
    public void processTicket(Ticket ticket) {

    }

    @Override
    public void processPayment() {

    }
}
