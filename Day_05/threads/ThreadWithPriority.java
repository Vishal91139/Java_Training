package Day_05.threads;

public class ThreadWithPriority extends Thread {
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName()
            +" | Priority: "+Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {
        ThreadWithPriority t1 = new ThreadWithPriority();
        ThreadWithPriority t2 = new ThreadWithPriority();
        ThreadWithPriority t3 = new ThreadWithPriority();
        t1.setName("low priority thread");
        t2.setName("medium priority thread");
        t3.setName("high priority thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        // t3.setPriority(11);  //It will be IllegalArgumentException

        t1.start();
        t2.start();
        t3.start();
    }
}

/*
ℹ️Points to remember:
⭐ Thread Priority is only a suggestion to the JVM or the scheduler.
⭐ High priority doesnt guarantee execution order
⭐ Higher priority threads may get more CPU Scheduler time
⭐ The actual behaviour depends on the JVM And operating System
*/
