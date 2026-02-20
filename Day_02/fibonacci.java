import java.util.Scanner;

public class fibonacci {
    void fibo(int n){
        int a = 0;
        int b = 1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci fb = new fibonacci();
        fb.fibo(n);
    }
}
