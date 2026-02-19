import java.util.*;

public class strongnumber {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int last = temp % 10;
            int fact = 1;
            for(int i=1; i<=last; i++){
                fact *= i;
            }
            temp /= 10;
            sum += fact;
        }
        if(sum == n){
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}
