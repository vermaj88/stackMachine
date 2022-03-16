package com.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StackMachine {


    public static void main(String[] args) {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new StackImpl();
        try {
            String line;
            System.out.println("EnterCommand:");
            while ((line = bufferedReader.readLine()) != null) {
                String[] input = line.split("\\s+");
                Command command = getCommand(input);
                if (command == null) {
                    System.out.println("ERROR: Invalid Command:" + line);
                    System.out.println("EnterCommand:");
                    continue;
                }
                Map<Command, Runnable> commands = getCommandRunnableMap(stack);

                if (command == Command.PUSH) {
                    try {
                        Double value = Double.parseDouble(input[1]);
                        stack.push(value);
                    } catch (NumberFormatException exception) {
                        System.out.println("ERROR: Input is not a valid number, ignoring command: " + line);
                    }
                } else {
                    commands.get(command).run();
                }
                System.out.println("EnterCommand:");
            }
        } catch (
                IOException exception) {
            System.err.println("ERROR: I/O Exception");
        }

    }

    private static Map<Command, Runnable> getCommandRunnableMap(Stack stack) {
        Map<Command, Runnable> commands = new HashMap<>();
        commands.put(Command.POP, stack::pop);
        commands.put(Command.CLEAR, stack::clear);
        commands.put(Command.ADD, stack::add);
        commands.put(Command.MUL, stack::multiply);
        commands.put(Command.NEG, stack::negate);
        commands.put(Command.INV, stack::inv);
        commands.put(Command.UNDO, stack::undo);
        commands.put(Command.PRINT, stack::print);
        commands.put(Command.QUIT, stack::quit);
        return commands;
    }

    private static Command getCommand(String[] input) {
        if (input != null && input.length > 0) {
            Command command = Command.getCommand(input[0]);
            if (command != null) {
                if (command == Command.PUSH) {
                    if (input.length == 2) {
                        return command;
                    }
                } else {
                    if (input.length == 1) {
                        return command;
                    }
                }
            }
        }
        return null;
    }
}

