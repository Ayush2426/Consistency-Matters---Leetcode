import java.util.*;
public class QueueUsingStack {

    private Stack<Integer> st1;
    private Stack<Integer> st2;

    public QueueUsingStack(){
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st1.pop());
        }
    }

    public int pop(){
        return st1.pop();
    }

    public int peek(){
        return st1.peek();
    }

    public boolean empty(){
        return st1.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack qus = new QueueUsingStack();
        qus.push(12);
        qus.push(2);
        qus.push(1);
        qus.push(4);
        qus.push(7);
        qus.pop();
        qus.peek();
        qus.empty();
    }
}
