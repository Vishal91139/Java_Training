package DAY_08.dsa.collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaintainInsertionOrder {
    public static void main(String[] args) {
        HashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(14);
        set.add(2);
        set.add(3);
        set.add(14);
        set.add(3);
        set.add(31);
        set.add(21);
        System.out.println(set);
    }
}
