
import java.util.Stack;

public class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;

    public void minStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if (mainStack.size() == 0 || minStack.size() >= val) {
            minStack.push(val);
        }
        mainStack.push(val);

    }

    public void pop() {
        int pop1 = mainStack.pop();
        int pop2 = minStack.peek();

        if (pop1 == pop2) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.minStack();
        ms.push(12);
        ms.push(2);
        ms.push(1);
        ms.push(6);
        ms.push(15);
        ms.pop();
        ms.top();
        ms.getMin();
    }
}
