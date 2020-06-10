package com.parkingLot.models.accounts;

import com.parkingLot.models.people.Person;

public class Admin extends Account {
    public Admin(String userName, String saltedPasswordHash, Person person) {
        super(userName, saltedPasswordHash, person);
    }
}
