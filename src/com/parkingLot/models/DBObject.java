package com.parkingLot.models;

import java.util.Objects;

public abstract class DBObject {
    private final long uid; //unique identifier for gates

    private static long NEW_UID = 0;

    public DBObject() {
        this.uid = NEW_UID++;
    }

    public long getUid() {
        return uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // compares memory address
        if (o == null || getClass() != o.getClass()) return false; // compares class of the object
        DBObject dbObject = (DBObject) o;//as it is dbobject we can cast it safely
        return uid == dbObject.uid; //after casting we can compare by uid as it is property of dbobject
        //downcasting
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid); //two different memory object hashed to a same string
    }
}
