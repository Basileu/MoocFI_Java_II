/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class OneItemBox extends Box {

    private Item elem = null;
    public OneItemBox() {
    }
    
    @Override
    public void add(Item item) {
        if (elem == null) {
            System.out.println("elem was null");
            elem = item;
            System.out.println(elem);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (elem == null) {
            return false;
        } else if (elem.equals(item)) {
            return true;
        } else {
            return false;
        }
    }
    
}
