package DAY_08.dsa.collections.queues;

import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions = new ArrayDeque<>();
        actions.addLast("User types A");
        actions.addLast("User types B");
        actions.addLast("User Deletes B");
        System.out.println("Undo: "+actions.removeLast());
        System.out.println("Remaining actions: "+actions);
     }
}
