package DAY_09.collections.lambdaExpressions;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println("Initial list: "+list);
        Collections.sort(list, (a,b) -> a-b); // Ascending
        System.out.println("Sorted list: "+list);
        Collections.sort(list, (a,b) -> b-a);
        System.out.println("Sorted list: "+list); // Descending
    }
}
