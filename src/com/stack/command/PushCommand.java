package com.stack.command;

import com.stack.Stack;

public class PushCommand  implements ICommand{

    Double  item;
    Stack  stack;

    public PushCommand(Stack stack, Double item){
        this.stack = stack;
        this.item = item;
    }

    @Override
    public void execute() {
          stack.add(item);
    }

    @Override
    public void undo() {
        stack.remove();
    }
}
