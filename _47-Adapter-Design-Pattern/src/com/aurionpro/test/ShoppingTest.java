package com.aurionpro.test;

import com.aurionpro.model.*;

import java.util.ArrayList;
import java.util.List;

public class ShoppingTest {
    public static void main(String[] args) {
        List<IItems> cart = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart(cart);
        cart.add(new Biscuit("Parle-G", 10));
        cart.add(new HatAdapter(new Hat("Summer", "Designer Caps", 100, 10)));
    shoppingCart.addItemsToCart(new Biscuit("BourBon",20));
        List<IItems> cartItems = shoppingCart.getCartItems();
        double cartPrice = shoppingCart.getCartPrice();
        System.out.println(cartPrice);
        System.out.println(cartItems);
    }
}
