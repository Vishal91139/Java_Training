package DAY_08.string;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Hello";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reversed: "+reverse);
    }
}
