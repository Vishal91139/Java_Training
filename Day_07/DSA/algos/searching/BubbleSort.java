package Day_07.DSA.algos.searching;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                int temp = 0;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,2,1,3,7,6,5};
        System.out.println("The given array is: "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("The sorted array is: "+Arrays.toString(arr));
    }
}
