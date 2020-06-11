package com.parkingLot.models.people;

import com.parkingLot.models.Address;
import com.parkingLot.models.DBObject;
import com.parkingLot.models.accounts.Account;

//builder pattern
public class Person extends DBObject {
    private String name;
    private Address address;
    private String phoneNumber;
    //private final Account account;
    private Account account; //person can have many account but an account has only one person

    public Person(Builder builder) {
        setName(builder.name);
        setAddress(builder.address);
        setPhoneNumber(builder.phoneNumber);
        setAccount(builder.account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static final class Builder {

        private String name;
        private Address address;
        private String phoneNumber;
        private Account account;

        //this enforce that whenever we can create a builder for a person we have to specify a name
        public Builder(String name) {
            this.name = name;
        }

//        public Builder setName(String name) {
//            this.name = name;
//            return this;
//        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAccount(Account account) {
            this.account = account;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
