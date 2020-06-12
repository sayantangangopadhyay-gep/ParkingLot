package com.parkingLot.exceptions;

public class SpotAlreadyOccupiedException extends Throwable {
    public SpotAlreadyOccupiedException(String message) {
        super(message);
    }
}
