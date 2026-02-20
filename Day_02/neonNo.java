import java.util.*;

public class neonNo {
    static boolean isNeon(int n){
        int square = n*n;
        int sum = 0;
        while(square>0){
            int last = square%10;
            sum += last;
            square /= 10;
        }
        if(sum == n){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num+" is neon number: "+isNeon(num));
    }
}
