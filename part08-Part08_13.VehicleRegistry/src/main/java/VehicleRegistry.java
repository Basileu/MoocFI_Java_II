
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class VehicleRegistry {

    private final HashMap<LicensePlate, String> myRegistry = new HashMap<>();

    public VehicleRegistry() {
    }

    //assigns the owner it received as a parameter to a car that corresponds to 
    //the license plate received as a parameter. 
    //If the license plate doesn't have an owner, the method returns true. 
    //If the license already has an owner attached, the method returns false and does nothing.
    public boolean add(LicensePlate licensePlate, String owner) {
        if (myRegistry.containsKey(licensePlate)) {
            return false;
        }
        myRegistry.put(licensePlate, owner);
        return true;
    }

    // returns the owner of the car corresponding to the license plate received 
    // as a parameter. 
    // If the car isn't in the registry, the method returns null.
    public String get(LicensePlate licensePlate) {
        if (!myRegistry.containsKey(licensePlate)) {
            return null;
        }
        return (myRegistry.get(licensePlate));
    }
    
    // removes the license plate and attached data from the registry. 
    // The method returns true if removed successfully and false if 
    // the license plate wasn't in the registry.
    public boolean remove(LicensePlate licensePlate) {
//        if (!myRegistry.containsKey(licensePlate)) {
//            return false;
//        }
        return (myRegistry.remove(licensePlate, myRegistry.get(licensePlate)));

    }
    public void printLicensePlates() {
        for (LicensePlate object : myRegistry.keySet()) {
            System.out.println(object);
        }
    }
    public void printOwners() {
        String ownerOld = null;
        ArrayList<String> myList = new ArrayList<>();
        
        for (String owner : myRegistry.values()) {
            if (!myList.contains(owner)) {
                myList.add(owner);
            }
        }
        for (String string : myList) {
            System.out.println(string);
        }
    }
}
