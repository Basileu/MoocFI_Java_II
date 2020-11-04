/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Student extends Person{
    private int nrCredits;

    public Student(String name, String address) {
        super(name, address);
    } 
    public void study() {
        nrCredits++;
    }
    public int credits() {
        return nrCredits;
    }
    
    @Override
    public String toString() {
        return (super.toString() + "\n  " + "Study credits " + credits());
    }
    
}
