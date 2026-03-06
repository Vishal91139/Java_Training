package DAY_08.dsa.collections.sets;

import java.util.*;

public class WildCards {
    public static void printList(List<?> list){
        for(Object o : list){
            System.out.print(o+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("Java");
        string.add("Python");
        string.add("c++");
        string.add("JavaScript");
        printList(string);
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(4);
        printList(integers);
    }
}
