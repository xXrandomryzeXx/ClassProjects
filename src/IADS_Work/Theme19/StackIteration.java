/* Current file: StackIteration.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme19;

import java.util.Stack;

public class StackIteration {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Using lambda");
        stack.stream().forEach(element -> System.out.println(element));
        System.out.println("Using foreach loop");
        for(int elm : stack){
            System.out.println(elm);
        }
    }
}
