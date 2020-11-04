
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class StorageFacility {

    Map<String, ArrayList<String>> myMap = new HashMap<>();

    public StorageFacility() {
    }

    // adds the parameter item to the storage unit that is also given as a parameter.
    public void add(String unit, String item) {
        myMap.putIfAbsent(unit, new ArrayList<>());
        myMap.get(unit).add(item);
    }

//  returns a list that contains all the items in the storage unit indicated by the parameter. 
    //If there is no such storage unit or it contains no items, the method should return an empty list.    
    public ArrayList<String> contents(String storageUnit) {
//        ArrayList<String> retArray = (ArrayList<String>)myMap.get(storageUnit);
//        if (retArray == null) {
//            retArray = new ArrayList<>();
//            retArray.add("");
//        }
//        return retArray;

        // this approach creates object by default
        ArrayList<String> retArray = new ArrayList<>();
//        retArray.add("");
        return myMap.getOrDefault(storageUnit, retArray);
    }

    // removes the given item from the given storage unit. NB! 
    // Only removes one item — if there are several items with the same name, 
    // the rest still remain. 
    // If the storage unit would be empty after the removal, the method also removes the unit.
    public void remove(String storageUnit, String item) {
        if (!myMap.containsKey(storageUnit))
            return;
        
        ArrayList<String> arr = myMap.get(storageUnit);
        arr.remove(item);
        if (arr.size() == 0) {
//            System.out.println("unit is empty");
            myMap.remove(storageUnit);
        }
    }

    // returns the names of the storage units as a list. NB! 
    // Only the units that contain items are listed.
    public ArrayList<String> storageUnits() {
        ArrayList<String> retArray = new ArrayList<>();
        for (String storage : myMap.keySet()) {
            if (myMap.get(storage).size() > 0) {
//                System.out.println("myMap.get(storage) " + myMap.get(storage));
                retArray.add(storage);
            }
        }
        return retArray;
    }
}
