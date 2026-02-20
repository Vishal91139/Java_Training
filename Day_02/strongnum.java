import java.util.*;

public class strongnum {
    int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }

    boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int last = temp % 10;
            sum = sum + fact(last);
            temp = temp/10;
        }
        if(sum == n){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        strongnum ob = new strongnum();
        System.out.println(n + " is Strong number: "+ob.isStrong(n));
    }
}
