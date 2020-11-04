/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Organism implements Movable{
    private int coordX;
    private int coordY;

    public Organism(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    @Override
    public String toString() {
        return("x: " + coordX + "; y: " + coordY);
    }
    public void move(int dx, int dy) {
        coordX += dx;
        coordY += dy;
    }
}
