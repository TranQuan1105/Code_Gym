package ss11_stack_queue;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(32);
        stack.push(21);
        stack.push(513);
        stack.push(305);
        stack.push(210);
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
