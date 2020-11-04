/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class CD implements Packable {
//CD has a constructor which is given the artist (String), 
    //name of the CD (String), and the publication year (int). 
    //The weight of all CDs is 0.1 kg.

    private String artistName;
    private String nameCD;
    private int year;
    private final double weight = 0.1;

    public CD(String artistName, String nameCD, int year) {
        this.artistName = artistName;
        this.nameCD = nameCD;
        this.year = year;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artistName + ": " + nameCD + " (" + year + ")"; 
   }
}
