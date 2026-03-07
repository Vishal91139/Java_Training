package DAY_09.collections.maps;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106,"Vishal");
        ht.put(117,"Yashas");
        ht.put(128,"Varada");
        ht.put(100,"shashank");
        ht.put(99,"pranav");
        ht.put(101,"myself");
        for(Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
