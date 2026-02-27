package Day_05.exceptions;

public class Demo {
    public static void main(String[] args) {
        try {
            int balance = 2000;
            int withdraw = 3000;
            if(withdraw > balance){
                throw new ArithmeticException("Insufficient funds");
            }
            System.out.println("Withdrawl successful");
        } catch(ArithmeticException e) {
            System.out.println("Caught exception: "+e.getMessage());
        }
    }
}
