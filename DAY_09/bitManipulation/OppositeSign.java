package DAY_09.bitManipulation;

public class OppositeSign {
    public static void main(String[] args) {
        int a = 10;
        int b = -5;
        if((a ^ b) < 0) System.out.println("Opposite sign");
        else System.out.println("same sign");
    }
}
