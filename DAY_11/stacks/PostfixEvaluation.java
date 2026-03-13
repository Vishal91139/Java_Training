package DAY_11.stacks;

import java.util.Stack;

public class PostfixEvaluation {
    static int evaluate(String exp){
        Stack<Integer> stack = new Stack<>();
        for(char c : exp.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }else{
                int b = stack.pop();
                int a = stack.pop();
                switch(c){
                    case '+' -> stack.push(a+b);
                    case '-' -> stack.push(a-b);
                    case '*' -> stack.push(a*b);
                    case '/' -> stack.push(a/b);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(evaluate("28*"));
    }
}
