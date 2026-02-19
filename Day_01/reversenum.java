import java.util.Scanner;

public class reversenum {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0){
            int last = n % 10;
            rev = (rev*10)+last;
            n = n/10;
        }
        System.out.println("Reversed number: "+rev);
    }
}
