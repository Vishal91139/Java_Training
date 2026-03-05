package Day_07.DSA.algos.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,2,1,3,7,6,5};
        System.out.println("The given array is: "+Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
}
