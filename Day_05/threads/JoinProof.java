package Day_05.threads;

public class JoinProof {
    static class Task extends Thread {
        public void run(){
            try{
                Thread.sleep(2000);
            } catch(Exception e){}
            System.out.println("task finished");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Task t1 = new Task();
        t1.start(); // The mainThread doesnt wait for this thread
        t1.join(); // code will wait (guaranteed!!)
        System.out.println("Main thread Resumes");
    }
}
