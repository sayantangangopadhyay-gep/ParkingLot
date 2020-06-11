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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSaltedPasswordHash() {
        return saltedPasswordHash;
    }

    public void setSaltedPasswordHash(String saltedPasswordHash) {
        this.saltedPasswordHash = saltedPasswordHash;
    }

    public Person getPerson() {
        return person;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
