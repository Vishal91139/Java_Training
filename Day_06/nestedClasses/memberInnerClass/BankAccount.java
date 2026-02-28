package Day_06.nestedClasses.memberInnerClass;

public class BankAccount {
    private double balance = 5000;
    // Member Inner class
    class Transaction {
        void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
                System.out.println("Withdrawn: "+amount);
            } else {
                System.out.println("Insufficient Funds.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount.Transaction tx = account.new Transaction();
        tx.withdraw(2000);
        tx.withdraw(3001);
        System.out.println(account.balance);
    }
}
/*
ℹ️Points to remember:
⭐ Transaction belongs to specific account
⭐ Direct access to private variable balance
⭐ Clean encapsulation
*/
