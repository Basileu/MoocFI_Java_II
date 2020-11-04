
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
public class DictionaryOfManyTranslations {

    private Map<String, List<String>> myMap = new HashMap<>();
            
    public DictionaryOfManyTranslations() {
        
    }

    public void add(String word, String translation) {
        myMap.putIfAbsent(word, new ArrayList<>());
        myMap.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        if (myMap.containsKey(word) && myMap.get(word) != null)
            return (ArrayList<String>)myMap.get(word);
        else
            return new ArrayList<>();
    }
    
    public void remove(String word) {
        myMap.remove(word);
    }
}
