package DAY_09.collections;

import java.util.*;

public class JavaIterator {
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

        // Remove the elements greater than 10
        while(it.hasNext()){
            Integer i = it.next();
            if(i > 10){
                it.remove();
            }
        }
        System.out.println("After: "+list);
    }
}
