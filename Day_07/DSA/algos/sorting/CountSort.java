package Day_07.DSA.algos.sorting;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr){
        // step 1: Find max
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // step 2: Create a count array[0-max]
        int[] count = new int[max+1];
        // step 3: Calculate the freq of each element in the array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        // Step 4: Calculate cummulative frequency
        // skip index 0 and start from till max
        for(int i=1; i<=max; i++){
            // curr = curr + prev
            count[i] += count[i-1];
        } 
        // Step 5: create the output array
        int[] output = new int[arr.length];
        // step 6: start from the end of the array
        for(int i=arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        System.arraycopy(output,0, arr, 0, arr.length); 
    }
    public static void main(String[] args) {
        int arr[] = {3,4,6,1,4,3,2,3,1};
        System.out.println("The given array is: "+Arrays.toString(arr));
        countSort(arr);
        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
}
