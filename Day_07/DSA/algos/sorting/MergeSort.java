package Day_07.DSA.algos.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int s, int mid, int e){
        // sizes of the two subarrays to be merged
        int n1 = mid - s + 1;
        int n2 = e - mid;
        // temporary arrays
        int[] l = new int[n1];
        int[] r = new int[n2];
        // copy the data to the temporary arrays
        for(int i=0; i<n1; i++){
            l[i] = arr[s+i];
        }
        for(int j=0; j<n2; j++){
            r[j] = arr[mid+1+j];
        }
        // Initial indexes of first and second subarrays
        int i=0, j=0;
        // Initial index of the merged subarray
        int k = s;
        while(i<n1 && j<n2){
            if(l[i] <= r[j]){
                arr[k++] = l[i++];
            }else {
                arr[k++] = r[j++];
            }
        }
        // Copy remaining elem from l[] if any
        while(i < n1){
            arr[k++] = l[i++];
        }
        // Copy remaining elem from r[] if any
        while(j < n2){
            arr[k++] = r[j++];
        }
    }
    public static void mergeSort(int[] arr, int s, int e){
        if(s<e){
            // find the mid point 
            int mid = s+(e-s)/2;
            // sort first and second half
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, e);
            // merge sorted halves into one
            merge(arr, s ,mid, e);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,6,3,8,5,7,9,4,6,2,8};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
