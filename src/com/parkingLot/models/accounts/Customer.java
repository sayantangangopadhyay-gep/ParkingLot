package com.parkingLot.models.accounts;

import com.parkingLot.models.people.Person;

public class Customer extends Account {
    public Customer(String userName, String saltedPasswordHash, Person person) {
        super(userName, saltedPasswordHash, person);
    }
}
