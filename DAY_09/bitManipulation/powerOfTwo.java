package DAY_09.bitManipulation;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & (n-1)) == 0){
            System.out.println(n+" is power of 2");
        } else {
            System.out.println(n+" is not power of 2");
        }
    }
}
