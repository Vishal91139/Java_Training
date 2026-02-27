package Day_05.threads;

public class BankAccount {
    int balance = 1000;

    synchronized void withdrawl(int amount){
        balance -= amount;
    }

    public static void main(String[] args) throws Exception {
        BankAccount acc = new BankAccount();
        Thread t1 = new Thread(() -> acc.withdrawl(500));
        Thread t2 = new Thread(() -> acc.withdrawl(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        // join() will make sure that the main thread
        // waits for the child thread to complete
        System.out.println(acc.balance);
    }
}
