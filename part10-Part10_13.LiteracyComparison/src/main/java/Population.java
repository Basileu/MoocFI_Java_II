/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Population implements Comparable<Population>{
    private String gender;
    private String country;
    private double percLiteracy;
    private int year;

    public Population(String gender, String country, int year, double percLiteracy) {
        this.gender = gender;
        this.country = country;
        this.percLiteracy = percLiteracy;
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public double getPercLiteracy() {
        return percLiteracy;
    }
    @Override
    public int compareTo(Population o) {
        if (this.getPercLiteracy() < o.getPercLiteracy()) {
            return -1;
        } else if (this.getPercLiteracy() == o.getPercLiteracy()){
            return 0;
        } else {
            return 1;
        }
//        return (int)(this.getPercLiteracy() - (double)o.getPercLiteracy());
    }
    @Override
    public String toString() {
        // return "Population [country=" + country + ", gender=" + gender + ", percLiteracy=" + percLiteracy + ", year="
        //         + year + "]";
        return getCountry() + " (" + getYear()+ "), " + getGender() + ", " + getPercLiteracy();
    }

    public int getYear() {
        return year;
    }
    
    
}
