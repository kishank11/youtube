import java.util.Stack;

public class MinMaxStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private Stack<Integer> maxStack;

    public MinMaxStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        int popped = stack.pop();

        if (popped == minStack.peek()) {
            minStack.pop();
        }

        if (popped == maxStack.peek()) {
            maxStack.pop();
        }
        return popped;

    }

    public int getMin() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");

        }
        return minStack.peek();
    }

    public int getMax() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return maxStack.peek();
    }

}