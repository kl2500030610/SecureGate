package services;

import datastructures.UndoStack;

public class RuleService {

    private UndoStack undoStack;

    public RuleService() {
        undoStack = new UndoStack();
    }

    public void changeRule(String ruleDescription) {

        undoStack.push(ruleDescription);

        System.out.println("Rule updated: " + ruleDescription);
    }

    public void undoLastRule() {

        String lastRule = undoStack.pop();

        if (lastRule != null) {
            System.out.println("Undo performed. Reverted rule → " + lastRule);
        }
    }

    public void showLastRule() {

        String rule = undoStack.peek();

        if (rule == null) {
            System.out.println("No recent rule changes.");
        } else {
            System.out.println("Last rule change → " + rule);
        }
    }
}