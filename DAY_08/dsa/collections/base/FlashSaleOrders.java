package DAY_08.dsa.collections.base;

import java.util.*;

public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer> orderIds = new ArrayList<>();
        orderIds.add(101);
        orderIds.add(102);
        orderIds.add(103);
        System.out.println("Orders received: "+orderIds);
        System.out.println("No of Orders: "+orderIds.size());
    }
}
