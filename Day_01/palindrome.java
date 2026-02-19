import java.util.*;
public class palindrome {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(temp!=0){
            int last = temp%10;
            rev = rev*10 + last;
            temp = temp/10;
        }
        if(rev == n){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
