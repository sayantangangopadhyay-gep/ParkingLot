package com.parkingLot.models.accounts;

import com.parkingLot.models.people.Person;

public class Attendant extends Account {
    public Attendant(String userName, String saltedPasswordHash, Person person) {
        super(userName, saltedPasswordHash, person);
    }
}
