
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class ChangeHistory {
    private ArrayList<Double> myList;

    public ChangeHistory() {
        myList = new ArrayList<>();
    }
    public void add(double status) {
        myList.add(status);
    }
    public void clear() {
        myList.clear();
    }
    @Override
    public String toString() {
        return (myList.toString());
    }
    
    public double maxValue() {
        if (myList.size() == 0) {
            return 0;
        } else {
            double max = myList.get(0);
            for (int i=1; i<myList.size(); ++i){
                if (max < myList.get(i))
                    max = myList.get(i);
            }
            return max;
        }
    }
    public double minValue() {
        if (myList.size() == 0) {
            return 0;
        } else {
            double min = myList.get(0);
            for (int i=1; i<myList.size(); ++i){
                if (min > myList.get(i))
                    min = myList.get(i);
            }
            return min;
        }
    }
    public double average() {
        if (myList.size() == 0) {
            return 0;
        } else {
            double sum = 0;
            for (Double double1 : myList) {
                sum += double1;
            }
            return sum/myList.size();
        }
    }    
}
