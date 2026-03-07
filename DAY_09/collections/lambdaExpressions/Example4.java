package DAY_09.collections.lambdaExpressions;

import java.util.ArrayList;
// java StreamAPi - JAVA 8 (::) -> Streams (->) Lambda

public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(System.out::println); // stream Api
        list.forEach(n -> System.out.println(n)); // lambda
    }
}
