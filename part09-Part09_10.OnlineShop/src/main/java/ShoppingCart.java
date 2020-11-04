
import java.util.ArrayList;
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
public class ShoppingCart {

    private List<Item> myShoppinglist = new ArrayList<>();

    public ShoppingCart() {
    }

    public void add(String product, int price) {
        for (Item item : myShoppinglist) {
            if(item.equals(new Item(product, 1, price))) {
                item.increaseQuantity();
                return;
            }
        }
        myShoppinglist.add(new Item(product, 1, price));
    }

    public int price() {
        int totalPrice = 0;

        for (Item item : myShoppinglist) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item item : myShoppinglist) {
            System.out.println(item);
        }
    }
}
