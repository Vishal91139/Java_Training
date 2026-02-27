package Day_05.threads;

public class ATMTransaction extends Thread {
    public void run() {
        System.out.println("Processing ATM Transaction");
    }
    public static void main(String[] args) {
        ATMTransaction t = new ATMTransaction();
        System.out.println("Thread state: "+ t.getState());
        t.start();
        System.out.println("Thread state after start: "+t.getState());
    }
}
/*
code Explanation:
Initially the thread is in the new state. after calling start(),
it moves to runnable and executes the run() method.
The exact timing of the state change depends on the JVM Scheduler

ℹ️ Points to remember :
⭐ Thread is created once
⭐ start() change state
⭐ Thread cannot be restarted
⭐ Final state is Terminated or dead
*/