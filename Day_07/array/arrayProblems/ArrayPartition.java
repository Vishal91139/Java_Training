package Day_07.array.arrayProblems;

import java.util.Arrays;

public class ArrayPartition {
    public static int[] partition(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(arr[left]%2 == 0){
                left++;
            }
            while(arr[right]%2 != 0){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,5,12,7,6};
        System.out.println("Partioned array is: "+Arrays.toString(partition(arr)));
    }
}
