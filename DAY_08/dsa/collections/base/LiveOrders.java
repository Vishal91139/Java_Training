package DAY_08.dsa.collections.base;

import java.util.*;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders = new ArrayList<>();
        // new orders are added
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        // check order
        System.out.println("ORD103 exists? "+liveOrders.contains("ORD103"));
        // check the live orders
        // liveOrders.remove("ORD102"); //This will remove particular order id
        System.out.println("Live orders: "+liveOrders);
        liveOrders.clear();
        System.out.println("Orders after closing: "+liveOrders);
    }
}
