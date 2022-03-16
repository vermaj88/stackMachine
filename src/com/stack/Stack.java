package com.stack;

import java.util.List;

public interface Stack {

    /*
     PUSH <xyz> or <xyz> where <xyz> is a valid decimal number
     Pushes the numeric value <xyz> to the top of the stack
     å */
    public void push(Double item);

    /*
    Removes the top element from the stack
    */
    public void pop();


    /*
    Removes all elements from the stack
    */
    public void clear();

    /*
         Adds the top 2 elements on the stack and pushes the result back to the stack
     */

    public void add();

    /*
     Multiplies the top 2 elements on the stack and pushes the result back to the stack*?
     */
    public void multiply();

    /*
      Negates the top element on the stack and pushes the result back to the stack
     */
    public void negate();

    /*
        Inverts the top element on the stack and pushes the result back to the stack
     */
    public void inv();

    /*
        The last instruction is undone leaving the stack in the same state as before that instruction
     */
    public void undo();

    /*
        Prints all elements that are currently on the stack
     */
    public void print();

    /*
     * Exits the program
     */
    public void quit();


    public void add(Double item);


    public Double remove();


    public void addAll(List<Double> items);


}
