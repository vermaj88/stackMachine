package com.stack.command;

import com.stack.Stack;

public class InverseCommand  implements  ICommand{
    private Stack stack;
    private Double preservedState;

    public InverseCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        preservedState = stack.remove();
        stack.add(1/preservedState);
    }

    @Override
    public void undo() {
        stack.remove();
        stack.add(preservedState);
    }
}
