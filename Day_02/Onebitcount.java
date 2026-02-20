import java.util.*;

public class Onebitcount {
    static int countbit(int n){
        int count = 0;
        // while(n!=0){
        //     if((n&1) == 1){
        //         count++;
        //     }
        //     n = n>>1;
        // }

        // two methods to count

        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number of 1 bits is: " + countbit(n));
    }
}
