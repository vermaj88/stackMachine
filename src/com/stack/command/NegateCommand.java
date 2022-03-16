package com.stack.command;

import com.stack.Stack;

import java.util.ArrayList;
import java.util.List;

public class NegateCommand  implements ICommand{
    private Stack stack;
    private Double preservedState;

    public NegateCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        preservedState = stack.remove();
        stack.add(-1*preservedState);
    }

    @Override
    public void undo() {
        stack.remove();
        stack.add(preservedState);
    }
}
