package IADS_Work.Theme19;

import java.util.Stack;

public class StackClear {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Elements in stack: " + stack);
        System.out.println("Clearing stack using .clear()");
        stack.clear();
        System.out.println("Elements in stack: " + stack);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Elements in stack: " + stack);
        System.out.println("Clearing stack using a loop");
        while(stack.iterator().hasNext()){
            stack.pop();
        }
        System.out.println("Elements in stack: " + stack);
    }
}