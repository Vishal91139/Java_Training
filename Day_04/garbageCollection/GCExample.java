package Day_04.garbageCollection;

public class GCExample {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Python");
        s1 = s2;
        System.gc(); //Not mandatory
        // now in the string pool, java is not available
        // that proves that Garbage collection is Automatic
        System.out.println(s1);
    }
}
