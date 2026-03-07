package DAY_09.collections.maps;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // the values can be same but keys should be unique
        Map<String, String> hashmap = new HashMap<>(); 
        hashmap.put("03","ddd");
        hashmap.put("01","bbb");
        hashmap.put("02","aaa");
        hashmap.put("05","eee");
        hashmap.put("04","ccc");
        for(Map.Entry<String, String> entry : hashmap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Map<String, String> hashmap1 = new LinkedHashMap<>(); 
        hashmap1.put("03","ddd");
        hashmap1.put("01","bbb");
        hashmap1.put("02","aaa");
        hashmap1.put("05","eee");
        hashmap1.put("04","ccc");
        for(Map.Entry<String, String> entry : hashmap1.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
