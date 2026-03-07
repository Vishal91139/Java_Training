package DAY_09.collections;

import java.util.*;

public class RemoveUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.add(3);
        list.add(32);
        list.add(6);
        list.add(21);
        Iterator<Integer> it = list.iterator();
        System.out.println("Before: "+list);
        list.removeIf(n -> n%2 == 0);
        System.out.println("After: "+list);
    }
}
