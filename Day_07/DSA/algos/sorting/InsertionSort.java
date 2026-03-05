package Day_07.DSA.algos.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                // Shift operation
                arr[j+1] = arr[j]; 
                j--; //Empty space
            }
            arr[j+1] = temp; // Fill the space[] with the temp variable
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,2,1,3,7,6,5};
        System.out.println("The given array is: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
}
