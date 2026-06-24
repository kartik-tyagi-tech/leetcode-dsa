import java.util.Stack;

class MinStack {

    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int value) {
        int min;

        if (stack.isEmpty()) {
            min = value;
        } else {
            min = Math.min(value, stack.peek()[1]);
        }

        stack.push(new int[]{value, min});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}