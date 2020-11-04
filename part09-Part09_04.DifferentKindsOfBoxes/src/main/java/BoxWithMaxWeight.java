
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
public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> myList = new ArrayList<>();
    private int maxCapacity;
    

    public BoxWithMaxWeight(int capacity) {
        this.maxCapacity = capacity;
    }

    public void add(Item item) {
        int capacity = 0;
        for (Item item1 : myList) {
            capacity += item1.getWeight();
        }
        if (item.getWeight() + capacity <= maxCapacity) {
            myList.add(item);
            capacity += item.getWeight();
        }
    }

    public boolean isInBox(Item item) {
        if (myList.contains(item)) {
            System.out.println(item);
            return true;
        } else {
            return false;
        }
    }
}
