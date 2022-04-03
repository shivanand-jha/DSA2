package Questions;

import java.util.Scanner;
import java.util.Stack;

public class Sol {

        public static boolean isValid(String s) {
            int length = s.length();
            Stack<Character> stack = new Stack();
            char curr;
            for(int i=0;i<length;i++)
            {
                curr = s.charAt(i);
                // if current character is any opening bracket we push it into stack.
                if(curr=='{' || curr=='(' || curr=='['){
                    stack.push(curr);
                }
                // if the current character is exact closing bracket of stack top then we pop from the stack
                // else we return false
                if(curr==']'){
                    if(stack.empty() || stack.peek()!='['){
                        return false;
                    }
                    else stack.pop();
                }
                if(curr=='}'){
                    if(stack.empty() || stack.peek()!='{'){
                        return false;
                    }
                    else stack.pop();
                }
                if(curr==')'){
                    if(stack.empty() || stack.peek()!='('){
                        return false;
                    }
                    else stack.pop();
                }
            }
            return stack.empty();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s =sc.next();
        System.out.println(isValid(s));
    }
}
