package DAY_10.dataStructures.linear.linkedList.problems.cycleDetection;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class cycleDetection {
    static Node head = null;
    static void createList(){
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Creating a cycle
        head.next.next.next.next = head.next; // 5th node is connected to 2nd node
    }

    static boolean hasCycle() {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 step
            if(slow==fast){
                return true; // Detected a cycle
            }
        }
        return false; //No cycle has been detected
    }

    public static void main(String[] args) {
         createList();
        if (hasCycle()) {
            System.out.println("Cycle is Detected");
        } else {
            System.out.println("No cycle");
        }
    }
}
