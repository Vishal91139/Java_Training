import java.util.*;

public class armstrong {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        int count =0;
        int sum = 0;
        while(a!=0){
            a /= 10;
            count++;
        }
        a = n;
        while(a != 0){
            int last = a % 10;
            sum += Math.pow(last, count);
            a /= 10;
        }
        
        if(sum == n){
            System.out.println("ArmStrong number");
        }
        else {
            System.out.println("Not ArmStrong number");
        }
    }
}
