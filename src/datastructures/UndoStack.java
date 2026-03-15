package datastructures;

import java.util.Stack;

public class UndoStack {

    private Stack<String> stack;

    public UndoStack() {
        stack = new Stack<>();
    }

    public void push(String ruleChange) {
        stack.push(ruleChange);
    }

    public String pop() {

        if (stack.isEmpty()) {
            System.out.println("No actions to undo.");
            return null;
        }

        return stack.pop();
    }

    public String peek() {

        if (stack.isEmpty()) {
            return null;
        }

        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}