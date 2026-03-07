package DAY_09.bitManipulation;

public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n = 12;
        int result = n & -n;
        System.out.println("The RSB is: "+ result);
    }
}
