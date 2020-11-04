
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class IOU {

    private HashMap<String, Double> myMap = new HashMap<>();
    
    public IOU() {
    }
    
    // saves the amount owed and the person owed to to the IOU
    public void setSum(String toWhom, double amount) {
        myMap.put(toWhom, amount);
    
    }
    // returns the amount owed to the person whose name is given as a parameter. 
    // If the person cannot be found, it returns 0
    public double howMuchDoIOweTo(String toWhom) {
        return myMap.getOrDefault(toWhom, 0.0);
    }
}
