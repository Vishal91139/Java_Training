package DAY_13;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K,V> {
    private final int capacity;
    public LRUCache(int capacity){
        // the true at the end is the magic ingridient
        // it tells the  map to order items by access time,
        // not insert time
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // if the size gets bigger than our capacity, return true
        // (kick the oldest out)
        return size() > capacity;
    }

    public static void main(String[] args) {
        // lets build our 3-pair shoe rack
        LRUCache<String, String> shoeRack = new LRUCache<>(3);
        shoeRack.put("Monday", "Sneakers");
        shoeRack.put("Tuesday", "Boots");
        shoeRack.put("Wednesday", "Sandals");
        System.out.println("Rack Contents: "+shoeRack);

        // now lets say we access the "Sneakers" again on thursday
        // this makes Sneakers the MOST recently used
        shoeRack.get("Monday");
        System.out.println("Rack contents: "+shoeRack);

        // we buy a new loafers and try to put them on the rack
        shoeRack.put("Thursday", "Loafers");
        // lets see what got kicked out
        System.out.println("Rack after adding loafers: "+ shoeRack);
        // we notice that boots have been ticked out,
        // because sneakers were just accessed.
    }
}
