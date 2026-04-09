package DAY_13.nonLinear.heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
    static void findKthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        // 1. Insert all elements into the heap
        // 2. Remove the elements exceeding the k size
        for(int num : arr) {
            maxHeap.add(num);
            if(maxHeap.size() > k){
                maxHeap.poll(); // Remove smallest if size > k
            }
        }
        // after the operation, the top element will be the kth smallest
        System.out.println("The kth smallest in array: "+ Arrays.toString(arr)+ " is "+ maxHeap.peek());
    }

    public static void main(String[] args) {
        int[] arr = {4,9,2,1,3,0};
        int k = 3;
        findKthSmallest(arr,k);
    }
}