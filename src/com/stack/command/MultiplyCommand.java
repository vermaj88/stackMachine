package com.stack.command;

import com.stack.Stack;

public class MultiplyCommand extends ArithmeticCommand {

    public MultiplyCommand(Stack stack) {
        super(stack);
    }

    @Override
    protected Double performArithmetic(){
        return  preservedState.get(0)*preservedState.get(1);
    }

}
