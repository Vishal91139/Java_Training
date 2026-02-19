import java.util.Scanner;

public class countdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            count++;
        }else {
            while(n != 0){
            n = n/10;
            count++;
        }
        }
        System.out.println("The number of didgits are: "+count);
    }
}
