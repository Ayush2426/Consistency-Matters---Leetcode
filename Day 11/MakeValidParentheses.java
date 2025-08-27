
import java.util.Stack;

public class MakeValidParentheses {
    public int MakeValidParentheses(String s) {

        Stack<Character> st = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            } else if (st.size() > 0 && st.peek() == '(') {
                st.pop();
            } else {
                count++;
            }
        }
        return count + st.size();
    }
    public static void main(String[] args) {
        MakeValidParentheses mvp = new MakeValidParentheses();
        mvp.MakeValidParentheses("(())))");
    }
}
