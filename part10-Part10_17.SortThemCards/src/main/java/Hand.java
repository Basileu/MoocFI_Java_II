
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
public class Hand implements Comparable<Hand>{
    private List<Card> myList;

    public Hand() {
        myList = new ArrayList<>();
    }
     
    
    public void add(Card card) {
        myList.add(card);
    }
    public void print() {
        for (Card card : myList) {
            System.out.println(card);
        }
    }
    public void sort() {
        myList.stream().sorted().forEach(System.out::println);
    }
    private int getSum(){
        int sumValues = 0;
        for (Card card : myList) {
            sumValues += card.getValue();
        }
        return sumValues;
    }
    @Override
    public int compareTo(Hand o) {
        return this.getSum() - o.getSum();
    }
    
    public void sortBySuit() {
        Comparator cmp = Comparator.comparing(Card::getSuit).thenComparing(Card::getValue);
        Collections.sort(myList, cmp);
    }
}
