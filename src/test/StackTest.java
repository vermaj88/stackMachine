package test;


import com.stack.Stack;
import com.stack.StackImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class StackTest {

    Stack stack;

    @BeforeEach
    public void setup(){
        stack = new StackImpl();
    }


    @Test
    void push() {
        stack.push(1.5);
        stack.push(3.5);
        stack.push(5.5);
        stack.print();
        stack.undo();
        stack.print();
        stack.undo();
        stack.print();

    }

    @Test
    void pop() {
        stack.push(-1.5);
        stack.push(-2.5);
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
    }

    @Test
    void clear() {
        stack.push(-1.3);
        stack.push(-2.4);
        stack.push(-1.5);
        stack.push(-2.6);
        stack.clear();
        stack.print();
        stack.undo();
        stack.print();

    }

    @Test
    void negate() {
        stack.push(9.33);
        stack.push(1.44);
        stack.print();
        stack.negate();
        stack.print();
        stack.undo();
        stack.print();
    }

    @Test
    void inv() {
        stack.push(9.0);
        stack.push(10.0);
        stack.print();
        stack.inv();
        stack.print();
        stack.undo();
        stack.print();
    }

    @Test
    void add() {
        stack.push(5.6);
        stack.push(1.6);
        stack.push(1.9);
        stack.print();
        stack.add();
        stack.print();
        stack.add();
        stack.print();
        stack.undo();
        stack.print();
        stack.undo();
        stack.print();
    }

    @Test
    void multiply() {
        stack.push(100.0);
        stack.push(90.0);
        stack.push(7.0);
        stack.print();
        stack.multiply();
        stack.print();
        stack.multiply();
        stack.print();
        stack.undo();
        stack.print();
        stack.undo();
        stack.print();
    }

}
