
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Herd implements Movable {
    private List<Movable> myList = new ArrayList<>();
    
    @Override
    public String toString() {
        String retStr = "";
        for (Movable movable : myList) {
            retStr += movable.toString() + "\n";
        }
        return retStr;
    }
    
    public void addToHerd(Movable movable) {
        myList.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable movable : myList) {
            movable.move(dx, dy);
        }
    }
}
