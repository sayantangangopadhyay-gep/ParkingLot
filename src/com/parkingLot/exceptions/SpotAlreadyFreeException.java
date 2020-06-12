package com.parkingLot.exceptions;

public class SpotAlreadyFreeException extends Throwable {
    public SpotAlreadyFreeException(String message) {
        super(message);
    }
}
