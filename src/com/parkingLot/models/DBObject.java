package com.parkingLot.models;

public abstract class DBObject {
    private final long uid; //unique identifier for gates

    private static long NEW_UID = 0;

    public DBObject(){
        this.uid = NEW_UID++;
    }

    public long getUid() {
        return uid;
    }
}
