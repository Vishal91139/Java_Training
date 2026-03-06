package DAY_08.dsa.collections.sets;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,6,6,7,8};
        System.out.println(Arrays.toString(arr));
        Set<Integer> UniqueElements = new HashSet<>();
        for(int x : arr){
            UniqueElements.add(x);
        }
        System.out.println(UniqueElements);

        Set<Integer> nonDuplicates = new HashSet<>();
        nonDuplicates.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,0,9));
        System.out.println(nonDuplicates);
    }
}
