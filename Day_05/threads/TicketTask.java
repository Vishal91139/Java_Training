package Day_05.threads;

public class TicketTask implements Runnable{
    String task;
    TicketTask(String task){
        this.task = task;
    }
    public void run(){
        System.out.println(task+ " in progress.");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new TicketTask("Seat assignment"));
        Thread t2 = new Thread(new TicketTask("Payment processing"));
        Thread t3 = new Thread(new TicketTask("SMS Notification"));
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
ℹ️Points to remember:
Each Runnable Object is a job, and the thread class is
responsible only for execution, which makes this approach
cleaner and more flexible.
⭐ implements Runnable
⭐ better design
⭐ Interviewers mostly ask this
⭐ Supports multiple inheritance via interface
*/