package com.stack;

import com.stack.command.*;

import java.util.LinkedList;
import java.util.List;

public class StackImpl implements Stack{


    private final List<Double> stack = new LinkedList<>();
    private List<ICommand> commands = new LinkedList<>();

    @Override
    public void push(Double item) {
        ICommand command = new PushCommand(this, item);
        execute(command);
    }


    @Override
    public void pop() {
        if (validateStackSize(Command.POP, stack.size())) {
            ICommand command = new PopCommand(this);
            execute(command);
        }
    }


    @Override
    public void clear() {
        ICommand command = new ClearCommand(this);
        execute(command);
    }

    @Override
    public void add() {
        if (validateStackSize(Command.ADD, stack.size())) {
            ICommand command = new AddCommand(this);
            execute(command);
        }
    }


    @Override
    public void multiply() {
        if (validateStackSize(Command.MUL, stack.size())) {
            ICommand command = new MultiplyCommand(this);
            execute(command);
        }
    }


    @Override
    public void negate() {
        if (validateStackSize(Command.NEG, stack.size())) {
            ICommand command = new NegateCommand(this);
            execute(command);
        }
    }

    @Override
    public void inv() {
        if (validateStackSize(Command.INV, stack.size())) {
            ICommand command = new InverseCommand(this);
            execute(command);
        }

    }

    @Override
    public void undo() {
        if (commands.size() > 0) {
            ICommand command = this.commands.remove(0);
            command.undo();
            printTopOfStack();
        } else {
            System.err.println("Command stack is empty, no more commands to undo");
        }
    }

    @Override
    public void print() {
        System.out.println(stack.toString());
    }

    @Override
    public void quit() {
        System.exit(0);
    }


    public void printTopOfStack() {
        if (stack.size() > 0) {
            System.out.println("Top of Stack item:" + stack.get(0));
        }
        else{
            System.out.println("Stack is empty , no top of stack item to print");
        }

    }

    private boolean validateStackSize(Command command, int stackSize) {
        if (stackSize >= command.getMinStackSize()) {
            return true;
        }
        System.err.println("Not enough elements  on the stack for operation: " + command);
        return false;
    }

    @Override
    public void add(Double item) {
        stack.add(0, item);
    }

    @Override
    public Double remove() {
        if (stack.size() > 0) {
            return stack.remove(0);
        }
        return null;
    }

    @Override
    public void addAll(List<Double> items) {
        stack.addAll(0, items);
    }

    private void execute(ICommand command) {
        command.execute();
        printTopOfStack();
        commands.add(0, command);
    }
}
