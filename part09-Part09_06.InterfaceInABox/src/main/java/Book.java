/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Book implements Packable {
//Book has a constructor which is given the author (String), 
//    name of the book (String), and the weight of the book (double) as parameters.

    private String author;
    private String bookName;
    private double bookWeight;

    public Book(String author, String bookName, double bookWeight) {
        this.author = author;
        this.bookName = bookName;
        this.bookWeight = bookWeight;
    }
    
    @Override
    public double weight() {
        return bookWeight;
    }
    
    @Override
    public String toString() {
        return author + ": " + bookName;
    }
}
