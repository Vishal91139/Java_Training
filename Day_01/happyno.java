import java.util.*;

public class happyno {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        while(temp!=1 && temp!=4){
            int sum = 0;
            while(temp>0){
                int last = temp % 10;
                sum += last*last;
                temp /= 10;
            }
            temp = sum;
        }
        if(temp == 1){
            System.out.println("Happy number");
        } else {
            System.out.println("Not a happy number");
        }
    }
}
