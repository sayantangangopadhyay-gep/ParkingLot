package com.parkingLot.models.accounts;

import com.parkingLot.models.DBObject;
import com.parkingLot.models.people.Person;

public abstract class Account extends DBObject {
    private String userName;
    private String saltedPasswordHash;
    private final Person person;
    private AccountStatus status;

    protected Account(String userName, String saltedPasswordHash, Person person) {
        this.userName = userName;
        this.saltedPasswordHash = saltedPasswordHash;
        this.person = person;
        this.status = AccountStatus.ACTIVE;
    }
}
