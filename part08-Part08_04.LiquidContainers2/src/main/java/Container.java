/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Container {

    private int volume;

    public Container() {
        volume = 0;
    }

    public int contains() {
        return volume;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        volume += amount;
        if (volume > 100) {
            volume = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        volume -= amount;
        if (volume < 0) {
            volume = 0;
        }
    }
    public String toString() {
        return (volume + "/100");
    }
    public int getAmount() {
        return volume;
    }
}
