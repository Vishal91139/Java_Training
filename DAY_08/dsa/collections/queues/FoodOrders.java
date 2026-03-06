package DAY_08.dsa.collections.queues;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders = new LinkedList<>();
        // for adding - add() [Fail][strict], offer()[Not fail][not strict]
        orders.add("Order101");  // strict capacity based
        orders.offer("Order102");  // Flexible
        System.out.println("Orders: "+orders);
        // for removal : remove() -> Strict[fail] poll() not Strict[Not fail]
        System.out.println("serving: "+orders.poll());
        System.out.println("Pending order: "+orders);
        // System.out.println(orders.element());
    }
}
