package com.stack.command;

import com.stack.Stack;

import java.util.ArrayList;
import java.util.List;

public class ClearCommand implements ICommand {

    private Stack stack;
    private List<Double> preservedState;

    public ClearCommand(Stack stack) {
        this.stack = stack;
        this.preservedState = new ArrayList<>();
    }

    @Override
    public void execute() {
        Double item;
        while ((item = stack.remove()) != null) {
            preservedState.add(item);
        }
    }

    @Override
    public void undo() {
        stack.addAll(preservedState);
    }

}
