package question_5;

import java.util.*;

public class StackImplementation {
    private Queue<Integer> q = new ArrayDeque<>();

    public void push(int x) {
        // to add new element to the queue
        q.offer(x);

        // Rearranging the elements in the queue
        for (int i = 0; i < q.size() - 1; ++i)
            q.offer(q.poll());
    }

    public int pop() {
        // to remove and return the front element of the queue
        return q.poll();
    }

    public int top() {
        // to find the front element of the queue
        return q.peek();
    }

    public static void main(String[] args) {
        // Creating an instance of the stack
        StackImplementation stack = new StackImplementation();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element: " + stack.top());

        System.out.println("Popped element: " + stack.pop());
    }
}
