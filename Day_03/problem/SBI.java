package Day_03.problem;

class Bank {
    void interest() {
        System.out.println("The Interest rate depends on the bank");
    }

    void interest(double rate){
        System.out.println("The interest rate is: "+rate);
    }
}

public class SBI extends Bank{
    void interest(double rate, int years){
        System.out.println("The "+rate+"% interest rate for "+years+" years is : "+rate*years);
    }

    public static void main(String[] args){
        SBI sbi = new SBI();
        sbi.interest();
        sbi.interest(20);
        sbi.interest(20, 2);
    }
}
