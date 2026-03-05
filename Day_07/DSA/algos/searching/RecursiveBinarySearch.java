package Day_07.DSA.algos.searching;

import java.util.Arrays;

public class RecursiveBinarySearch {
    public static int recursiveBinarySearch(int[] arr, int key, int s, int e){
        if(s > e) return -1;
        int mid = s + (e-s)/2;
        if(arr[mid] == key) return mid;
        else if(arr[mid] < key){
            return recursiveBinarySearch(arr, key, mid+1, e);
        }else {
            return recursiveBinarySearch(arr, key, s, mid-1);
        }
    }
    public static void main(String[] args) {
        int[] sortedArray = {1,2,3,4,5,6};
        int key = 5;
        int index = recursiveBinarySearch(sortedArray, key, 0 ,sortedArray.length-1);
        if(index != -1){
            System.out.println(key+" is present at index "+index);
        }else{
            System.out.println(key+ " is not present in the array "+Arrays.toString(sortedArray));
        }
    }
}
