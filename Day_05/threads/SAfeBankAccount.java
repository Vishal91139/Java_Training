package Day_05.threads;

public class SAfeBankAccount {
    int balance = 1000;

    synchronized void withdrawl(int amount){
        balance -= amount;
    }

    public static void main(String[] args) throws Exception {
        SAfeBankAccount acc = new SAfeBankAccount();
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

/*
Code Explanation:
The synchronization keyword ensures that only one thread can execute the withdraw() operaation
at a time, preventing Race condition and ensuring correct balance deduction.

ℹ️Points to remember
⭐ synchronization avoids RACE condition
⭐ Locks critical section in an application
⭐ Slower but safe
⭐ Essential for shared resources
*/
