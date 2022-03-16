package com.stack;

public enum Command {

    PUSH(0),
    POP(1),
    CLEAR(0),
    ADD(2),
    MUL(2),
    NEG(1),
    INV(1),
    UNDO(0),
    PRINT(0),
    QUIT(0);


    private int minStackSize;

    Command(int minStackSize) {
        this.minStackSize = minStackSize;
    }

    public final static Command getCommand(String currentCommand) {
        for (Command command : Command.values()) {
            if (command.name().equalsIgnoreCase(currentCommand)) {
                return command;
            }
        }
        return null;
    }
    public int getMinStackSize() {
        return minStackSize;
    }
}
