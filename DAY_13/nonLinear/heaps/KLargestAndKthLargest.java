package DAY_13.nonLinear.heaps;

import java.util.PriorityQueue;

public class KLargestAndKthLargest {
    static void findKLargestAndKthLargestElement(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 1. Insert all elements into the heap
        // 2. Remove the elements exceeding the k size
        for(int num : arr) {
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll(); // Remove smallest if size > k
            }
        }
        // print the Kth largest
        System.out.println("The kth largest is: "+ minHeap.peek());
        // print all the k-largest elements one by one
        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {19,21,4,9,3,7};
        int k = 3;
        findKLargestAndKthLargestElement(arr, k);
    }
}
