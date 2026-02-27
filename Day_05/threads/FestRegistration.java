package Day_05.threads;

public class FestRegistration {
    static class FormFilling extends Thread {
        public void run(){
            System.out.println("Form filling started");
        }
    }
    static class DocumentUpload extends Thread {
        public void run(){
            System.out.println("Document Upload started");
        }
    }
    static class EmailNotification extends Thread {
        public void run(){
            System.out.println("Email Notification sent");
        }
    }

    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentUpload t2 = new DocumentUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
Points to remember
⭐ JAva program starts with one main thread
⭐ Threads allow parallel execution -> concurrency
⭐ Output order is not guaranteed
⭐ Threads share the same memory
⭐ Improves the performance and responsiveness
⭐ When start() is called, the JVM creates a new thread
⭐ when run() is called directly(), there is no concurrency

ℹ️ Process vs Thread
⭐ Process is a running program
⭐ Thread: A path of execution inside the program
⭐ A process has its own memory
⭐ Threads share the same memory
⭐ Creating a Thread is Cheaper than creating a process
⭐ Examples: Process -> Chrome Browser Thread -> New Tab of Chrome
🟢 Closing a tab will not close chrome or kill chrome
*/
