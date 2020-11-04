
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
public class Box implements Packable {

    private final double maxWeight;
    private ArrayList<Packable> myList = new ArrayList<>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(Packable item) {
        if (weight() + item.weight() <= maxWeight) {
//            boxWeight += item.weight();
            myList.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + myList.size() + " items, total weight " + weight() + " kg";
    }

    public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        for (Packable packable : myList) {
            weight += packable.weight();
        }
        return weight;
    }

}
