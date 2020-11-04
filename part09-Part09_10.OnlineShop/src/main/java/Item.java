
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author basil
 */
public class Item {

    private int qty;
    private int unitPrice;
    private String product;

    // a constructor that creates an item corresponding to the product given as a parameter. 
    //qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
    public Item(String product, int qty, int unitPrice) {
        this.qty = qty;
        this.product = product;
        this.unitPrice = unitPrice;
    }

    // return the price of the item. 
    // You get the items price by multiplying its unit price by its quantity(qty).    
    public int price() {
        return (qty * unitPrice);
    }
 //increases the quantity by one    
    public void increaseQuantity () {
        qty += 1;
    }
    @Override
    public String toString() {
        return product + ": " + qty;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.qty;
        hash = 37 * hash + this.unitPrice;
        hash = 37 * hash + Objects.hashCode(this.product);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.unitPrice != other.unitPrice) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
    
}
