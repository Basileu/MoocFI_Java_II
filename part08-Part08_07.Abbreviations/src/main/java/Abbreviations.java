
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
public class Abbreviations {
    private HashMap<String, String> myMap;
    
    public Abbreviations() {
        myMap = new HashMap<>();
    }
    
    // adds a new abbreviation and its explanation.
    public void addAbbreviation(String abbreviation, String explanation) {
        myMap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return (myMap.containsKey(abbreviation));
    }
    public String findExplanationFor(String abbreviation) {
        return (myMap.get(abbreviation));
    }
}
