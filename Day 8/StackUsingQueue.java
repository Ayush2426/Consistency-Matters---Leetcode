
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        q1.add(x);

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    public int pop() {
        return q1.remove();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue suq = new StackUsingQueue();
        suq.push(12);
        suq.push(2);
        suq.push(22);
        suq.push(9);
        suq.pop();
        suq.top();
        suq.empty();
    }
}
