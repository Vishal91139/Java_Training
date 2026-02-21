package Day_03.overloading;

public class Calculator {
    static void calci(int a, int b){
        System.out.println(a+b);
    }

    static void calci(double a, double b){
        System.out.println(a+b);
    }
    
    static void calci(int a, int b, int c){
        System.out.println((a+b)/c);
    }
    public static void main(String[] args){
        calci(5,7);
        calci(5.3, 7.7);
        calci(5,7,2);
    }
}
