package DAY_13.nonLinear.heaps;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(2); 
        minHeap.offer(9); 
        minHeap.offer(6); 
        minHeap.offer(8); 
        minHeap.offer(4); 
        minHeap.offer(3); 
        minHeap.offer(1); 
        minHeap.offer(0); 
        System.out.println("IMn heap: "+ minHeap);
        System.out.println(minHeap.poll());
    }
}
