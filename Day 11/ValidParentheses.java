
import java.util.Stack;

public class ValidParentheses{
    public boolean isValidParentheses(String s){
        
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(stack.size() > 0 && c == ')' && stack.peek() == '('){
                stack.pop();
            }else if(stack.size() > 0 && c == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(stack.size() > 0 && c == ']' && stack.peek() == '['){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        vp.isValidParentheses("(){}{}[]");
    }
}