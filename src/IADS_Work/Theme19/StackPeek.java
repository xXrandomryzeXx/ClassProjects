package IADS_Work.Theme19;

import java.util.Stack;

public class StackPeek {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack elements: " + stack);
        System.out.println("Peeking on top element: " + stack.peek());
        System.out.println("Stack elements: " + stack);
    }
}