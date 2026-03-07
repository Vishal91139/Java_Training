package DAY_09.collections.maps;

import java.util.*;

public class TreemapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "c");
        map.put(1, "a");
        map.put(2, "b");
        System.out.println(map);
    }
}
