package com.parkingLot.models.parking;

import com.parkingLot.exceptions.MalformedVehicleException;
import com.parkingLot.exceptions.SpotAlreadyFreeException;
import com.parkingLot.exceptions.SpotAlreadyOccupiedException;
import com.parkingLot.exceptions.SpotNotAddedException;
import com.parkingLot.models.electronics.CustomerInfoPortal;
import com.parkingLot.models.electronics.DisplayBoard;
import com.parkingLot.models.parking.spots.Spot;
import com.parkingLot.models.parking.spots.SpotStatus;
import com.parkingLot.models.parking.spots.SpotType;
import com.parkingLot.models.vehicles.Vehicle;

import java.util.*;

public class Floor {
    private CustomerInfoPortal customerInfoPortal;
//    private Map<SpotType,List<Spot>> spots;
    private Map<SpotType,Set<Spot>> freeSpots; // to avoid iterate on list we can make it stack or set
    private Map<SpotType,Set<Spot>> occupiedSpots;
    private DisplayBoard displayBoard;
    private String name;

    public Floor(String name){
        //this.name = name;
        setName(name);
        displayBoard = new DisplayBoard();
        freeSpots = new HashMap<>();
        occupiedSpots = new HashMap<>();
        customerInfoPortal = new CustomerInfoPortal();
    }

    private void populateMap(SpotType type){
        if(!freeSpots.containsKey(type)){
            freeSpots.put(type,new HashSet<>());
        }
        if(!occupiedSpots.containsKey(type)){
            occupiedSpots.put(type,new HashSet<>());
        }
    }

    public void addSpot(Spot spot) throws SpotAlreadyOccupiedException {
//        if(!freeSpots.containsKey(spot.getType())){
//            freeSpots.put(spot.getType(),new HashSet<>());
//        }
//        if(!occupiedSpots.containsKey(spot.getType())){
//            occupiedSpots.put(spot.getType(),new HashSet<>());
//        }
        populateMap(spot.getType());

        if(!spot.getStatus().equals(SpotStatus.FREE) || occupiedSpots.get(spot.getType()).contains(spot)){
            throw new SpotAlreadyOccupiedException("Can't move " + spot.toString() + " because it is occupied! ");
        }

        freeSpots.get(spot.getType()).add(spot);
    }

    public synchronized void park(Spot spot , Vehicle vehicle) throws MalformedVehicleException, SpotAlreadyOccupiedException, SpotNotAddedException {
        populateMap(spot.getType());

        if(!freeSpots.get(spot.getType()).contains(spot)){
            throw new SpotNotAddedException("Spot must be added before it can be parked in! ");
        }
        spot.park(vehicle);
        freeSpots.get(spot.getType()).remove(spot);
        occupiedSpots.get(spot.getType()).add(spot);

        updateDisplayBoard();
    }

    public synchronized Vehicle unPark(Spot spot) throws SpotAlreadyFreeException, SpotNotAddedException {
        populateMap(spot.getType());

        if(!occupiedSpots.get(spot.getType()).contains(spot)){
            throw new SpotNotAddedException("Spot must be added before it can be unparked out! ");
        }
        Vehicle vehicle = spot.unPark();
        occupiedSpots.get(spot.getType()).remove(spot);
        freeSpots.get(spot.getType()).add(spot);

        updateDisplayBoard();
        return vehicle;
    }

//    public void updateDisplayBoard() {
//        String message = "";
//        for(SpotType type: freeSpots.keySet()){
//            Set<Spot>spots = freeSpots.get(type);
//
//            message += "\n" + type.toString() + ": ";
//            if(spots.size()==0){
//                message += "No Free Spots! ";
//            }
//            else{
//                message += "\n" + spots.iterator().next().toString();
//            }
//        }
//        displayBoard.showMessage(message);
//    }
    //string concatenation is very expensive operation
    //we need to use string builder
    public void updateDisplayBoard() {
        StringBuilder message = new StringBuilder();
        message.append(this.toString()).append("\n");
        for(SpotType type: freeSpots.keySet()){
            Set<Spot>spots = freeSpots.get(type);

            message.append("\n").append(type.toString()).append(": ");
            if(spots.size()==0){
                message.append("No Free Spots! ");
            }
            else{
                message.append("\n" + spots.iterator().next().toString());
            }
        }
        displayBoard.showMessage(message.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerInfoPortal getCustomerInfoPortal() {
        return customerInfoPortal;
    }

    public void setCustomerInfoPortal(CustomerInfoPortal customerInfoPortal) {
        this.customerInfoPortal = customerInfoPortal;
    }

//    public List<Spot> getSpots() {
//        return spots;
//    }
//
//    public void setSpots(List<Spot> spots) {
//        this.spots = spots;
//    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    public void setDisplayBoard(DisplayBoard displayBoard) {
        this.displayBoard = displayBoard;
    }


}
