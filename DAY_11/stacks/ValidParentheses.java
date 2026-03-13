package DAY_11.stacks;

import java.util.Stack;

public class ValidParentheses {
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        // if(s.length()%2 !=0) return false;
        for(char c : s.toCharArray()){  // {,(,[,],),}
            if(c=='(' || c=='[' || c=='{'){
                // Push opening braces onto the stack
                stack.push(c);
            }else{
                if(stack.empty()){
                    return false;
                }
                char top = stack.pop();
                if(c==')' && top!='(') return false;
                if(c=='}' && top!='{') return false;
                if(c==']' && top!='[') return false;
            }
        } 
        return stack.empty();
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "[[{}";
        System.out.println(s1+" -> "+(isValid(s1) ? "Valid" : "Invalid"));
        System.out.println(s2+" -> "+(isValid(s2) ? "Valid" : "Invalid"));
    }
}
