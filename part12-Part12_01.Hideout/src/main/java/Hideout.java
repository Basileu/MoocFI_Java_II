/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Hideout<T> {
    private T hiddenObj;
    
    public Hideout() {
        hiddenObj = null;
    }
    
    public void putIntoHideout(T toHide) {
        hiddenObj = toHide;
    }
    public T takeFromHideout() {
        if (hiddenObj == null)
            return null;
        else {
            T temp = hiddenObj;
            hiddenObj = null;
            return temp;
        }
    }
    public boolean isInHideout() {
        return (!(hiddenObj == null));
    }
}
