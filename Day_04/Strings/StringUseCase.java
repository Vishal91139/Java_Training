package Day_04.Strings;

public class StringUseCase {
    public static void main(String[] args) {
        String message = "Order Confirmed";
        message = message + " - ID: 101";
        System.out.println(message);
        // message = message + " - ID: 102";
        // System.out.println(message);
    }
}
/*
String is imuutable
Stored in Scp (String Constant pool)
Every modification creates a new Object
Good for read only memory
 */
