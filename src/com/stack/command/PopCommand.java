package com.stack.command;

import com.stack.Command;
import com.stack.Stack;

public class PopCommand implements ICommand {

    private Double item;

    private Stack stack;

    public PopCommand(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        item = stack.remove();
    }

    @Override
    public void undo() {
        stack.add(item);
    }
}
