package com.parkingLot;

import com.parkingLot.models.Address;
import com.parkingLot.models.people.Person;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person p = new Person.Builder("sata").setPhoneNumber("26412663").build();
        Address a = new Address.Builder().setZipCode("711101").setCity("howrah").build();
        Address b = new Address.Builder().setState("wb").setCity("howrah maidan")
                .setCountry("India").setStreetAddress("59,M.C.Ghosh Lane").setZipCode("711101").build();

        System.out.println(p);
        System.out.println(a);
        System.out.println(b);
    }
}
