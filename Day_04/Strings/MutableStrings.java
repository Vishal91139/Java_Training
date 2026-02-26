package Day_04.Strings;

public class MutableStrings {
    public static void main(String[] args) {
        String s = "Vishal";
        s += " Kumar";
        System.out.println("String: "+s);

        // Mutable - Thread safe
        StringBuffer buffer = new StringBuffer("Vishal");
        buffer.append(" Kumar");
        System.out.println(buffer);

        // Mutable - not Thread safe
        StringBuffer builder = new StringBuffer("Vishal");
        builder.append(" Kumar");
        System.out.println(builder);
    }
}
