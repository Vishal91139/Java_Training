package Day_04.Strings;

public class Example2 {
    // String is immutable  - we cannot change it
    // We can just create copies - original string doesnt change
    // The concat() method creates a new onject - so results is ignored
    public static void main(String[] args) {
        String s = "Java";
        s.concat(" Programming");
        System.out.println(s);
    }
}
