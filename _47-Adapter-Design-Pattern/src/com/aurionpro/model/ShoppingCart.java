package com.aurionpro.model;

import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    List<IItems> itemsList;

    public ShoppingCart(List<IItems> itemsList) {
        this.itemsList = itemsList;
    }
    public void addItemsToCart(IItems items){
        itemsList.add(items);
    }
    public List<IItems> getCartItems(){
        return itemsList;
    }
    public double getCartPrice(){
        double itemPrice = 0;
        for (IItems x : itemsList) {
            itemPrice += x.getItemPrice();

        }
        return itemPrice;
    }
}
