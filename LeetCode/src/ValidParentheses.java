import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{') stack.push(c);
            else if(stack.empty()) return false;
            else if(c == ')' && stack.peek() == '(') stack.pop();
            else if(c == ']' && stack.peek() == '[') stack.pop();
            else if(c == '}' && stack.peek() == '{') stack.pop();
            else return false;
        }
        return stack.empty();
    }

    public static void main(String args[]){
        ValidParentheses v1 = new ValidParentheses();
        System.out.println(v1.isValid("()[]{}"));
        System.out.println(v1.isValid("(}"));
    }
}
