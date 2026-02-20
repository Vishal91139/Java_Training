import java.util.*;

public class AutomorphicNo {
    static boolean isAutomorphic(int n){
        int square = n*n;
        int temp = n;

        while(temp>0){
            if(temp%10 != square%10){
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num+ " is automorphic number: "+ isAutomorphic(num));
    }
}
