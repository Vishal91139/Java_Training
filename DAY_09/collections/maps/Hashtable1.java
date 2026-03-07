package DAY_09.collections.maps;

import java.util.Hashtable;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106,"Vishal");
        ht.put(117,"Yashas");
        ht.put(128,"Varada");
        ht.put(100,"shashank");
        ht.put(99,"pranav");
        ht.put(101,"myself");
        System.out.println(ht.getOrDefault(101, "Not found"));
        System.out.println(ht.getOrDefault(201, "Not found"));
        ht.putIfAbsent(104, "Gaurav");
        System.out.println("Updated table: "+ht);
        ht.putIfAbsent(99, "Ram");
        System.out.println("Updated table: "+ht);
    }
}
