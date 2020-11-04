
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author basil
 */
public class Warehouse {

    private Map<String, Integer> myProductsPrice = new HashMap<>();
    private Map<String, Integer> myProductsBalance = new HashMap<>();

    public Warehouse() {
    }

    //, which adds a product to the warehouse with the price and stock balance given as parameters
    public void addProduct(String product, int price, int stock) {
        myProductsPrice.put(product, price);
        myProductsBalance.put(product, stock);
    }

    // which returns the price of the product it received as a parameter. 
    // If the product hasn't been added to the warehouse, the method must return -99
    public int price(String product) {
        if (!myProductsPrice.containsKey(product)) {
            return -99;
        } else {
            return myProductsPrice.get(product);
        }
    }

    // returns the current remaining stock of the product in the warehouse. 
    // If the product hasn't been added to the warehouse, the method must return 0
    public int stock(String product) {
        if (!myProductsBalance.containsKey(product)) {
            return 0;
        } else {
            return myProductsBalance.get(product);
        }
    }
    //reduces the stock remaining for the product it received as a parameter by one, 
    //and returns true if there was stock remaining. 
    //If the product was not available in the warehouse the method returns false. 
    //A products stock can't go below zero.

    public boolean take(String product) {
        if (!myProductsBalance.containsKey(product)) {
            return false;
        } else {
            Integer balance = myProductsBalance.get(product);
//            System.out.println("balance = " + balance);
            if (balance > 0) {
                balance -= 1;
//                System.out.println("balance = " + balance);
                myProductsBalance.put(product, balance);
                return true;
            } else {
                if (balance <= 0) {
                    balance = 0;
                }
                return false;
            }

        }
    }
    
    // returns the names of the products in the warehouse as a Set
    public Set<String> products() {
        return myProductsBalance.keySet();
    }

}
