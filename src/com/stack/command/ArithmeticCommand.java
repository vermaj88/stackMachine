package com.stack.command;

import com.stack.Stack;

import java.util.ArrayList;
import java.util.List;

public abstract class ArithmeticCommand implements  ICommand {

    protected Stack stack;

    protected List<Double> preservedState;

    public ArithmeticCommand(Stack stack) {
        this.stack = stack;
        preservedState =  new ArrayList<>();
    }

    @Override
    public void execute() {
        preservedState.add(stack.remove());
        preservedState.add(stack.remove());
        stack.add(performArithmetic());
    }



    @Override
    public void undo() {
        stack.remove();
        stack.addAll(preservedState);
    }

    protected abstract Double performArithmetic();
}
