package DAY_08.dsa.collections.lists;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println("size: "+stack.peek());
        stack.pop();
        System.out.println("size: "+stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
