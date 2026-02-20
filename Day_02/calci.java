import java.util.Scanner;

public class calci {
    int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = sc.nextInt();

        System.out.print("Enter value b: ");
        int b = sc.nextInt();

        calci ob = new calci();
        int sum = ob.add(a, b);
        
        System.out.println("The sum is: "+sum);
    }
}
