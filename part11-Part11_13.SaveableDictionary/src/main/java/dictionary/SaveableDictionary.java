/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author basil
 */
public class SaveableDictionary {

    private Map<String, String> myDict = new HashMap<>();
    private List<Term> myTerms;
    private String file;

    public SaveableDictionary() {
        myTerms = new ArrayList<>();
    }

    public SaveableDictionary(String file) {
        this.file = file;
        myTerms = new ArrayList<>();
    }
    
    public boolean load() {
        try {
            List<String> myLines = new ArrayList<>();
            Files.lines(Paths.get(file)).forEach(s -> myLines.add(s));
            if(myLines.size() == 0)
                return false;
            
            for (String myLine : myLines) {
                String[] arr = myLine.split(":");
                this.add(arr[0], arr[1]);
            }

            
        } catch (Exception e) {
            System.out.println("Exception caught WTF is " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public void add(String words, String translation) {
//        int flag = 0;
//        int flag1 = 0;
////        System.out.println("adding String words, String translation = " + words + translation);
//        
//        for (Map.Entry<String, String> entry : myDict.entrySet()) {
//        
//            String key = entry.getKey();
////            System.out.println("String key = entry.getKey(); = " + key);
//            
//            String val = entry.getValue();
////            System.out.println("String val = entry.getValue(); = " + val);
//            
//            if (val.equals(words) && key.equals(translation)) {
////                System.out.println("hit!!!!!!!!!!!!!!!!!!!!!!!");
//                System.out.println("Val 1st key = " + key + " val = " + val);
//                flag = 1;
//            } else if (key.equals(words) && val.equals(translation)) {
////                System.out.println("2nd ############hit!!!!!!!!!!!!!!!!!!!!!!!");
//                System.out.println("Val 2nd key = " + key + " val = " + val);
//                flag = 1;
//            }
//        }        
//        if (flag == 0) {
//            myDict.put(words, translation);
//        }
        Term newTerm = new Term(words, translation);
        if (!myTerms.contains(newTerm))
            myTerms.add(newTerm);
    }

    public String translate(String word) {
//        String retStr = null;
//        for (Map.Entry<String, String> entry : myDict.entrySet()) {
//            String key = entry.getKey();
//            String val = entry.getValue();
//            if (val.equals(word)) {
//                retStr = key;
//            } else if (key.equals(word)) {
//                retStr = val;
//            }
//        }
//        return retStr;

        for (Term myTerm : myTerms) {
            if(myTerm.getWord1().equals(word)) {
                return myTerm.getWord2();
            } else if (myTerm.getWord2().equals(word)) {
                return myTerm.getWord1();
            }
        }
        return null;
    }

    public void delete(String word) {
//        List<String> toRemove = new ArrayList<>();
//        for (Map.Entry<String, String> entry : myDict.entrySet()) {
//            String key = entry.getKey();
//            String val = entry.getValue();
//            if (val.equals(word)) {
////                myDict.remove(key, val);
//                toRemove.add(key);
//            } else if (key.equals(word)) {
////                myDict.remove(key, val);
//                toRemove.add(key);
//            }
//        }
//        for (String string : toRemove) {
//            myDict.remove(string);
//        }
        for (Iterator<Term> iterator = myTerms.iterator(); iterator.hasNext();) {
            Term next = iterator.next();
            if (next.getWord1().equals(word) || next.getWord2().equals(word))
                iterator.remove();
        }
    }
    
    public boolean save() {
        try {
            System.out.println(myTerms);
            PrintWriter myWriter = new PrintWriter(file);
            for (Term myTerm : myTerms) {
                myWriter.println(myTerm.getWord1() + ":" + myTerm.getWord2());
            }
            myWriter.close();
        } catch (Exception e) {
            System.out.println("exception caught " + e.getMessage());
            return false;
        }
        return true;
    }
}
