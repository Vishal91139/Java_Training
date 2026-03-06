package DAY_08.dsa.collections.lists;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.remove("Mouse");
        cart.set(1,"Mechanical keyboard");
        System.out.println("Cart Items: "+cart);
        System.out.println("Total Items: "+cart.size());
    }
}
