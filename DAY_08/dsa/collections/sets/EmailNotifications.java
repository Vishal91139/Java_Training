package DAY_08.dsa.collections.sets;

import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        Set<String> emailQueue = new HashSet<>();
        emailQueue.add("a@gmai.com");
        emailQueue.add("b@gmai.com");
        emailQueue.add("a@gmai.com");
        emailQueue.add("b@gmai.com");
        emailQueue.add("c@gmai.com");
        emailQueue.add("d@gmai.com");
        emailQueue.add("e@gmai.com");
        System.out.println("Emails to send: "+emailQueue);
        System.out.println("Unique emails: "+emailQueue.size());
    }
}
