/* Current file: StackSearch.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme19;

import java.util.Stack;

public class StackSearch {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Stack elements: " + stack);
        System.out.println("Searching for element 30...");
        System.out.println("Found element 30 at position -> " + stack.search(30));
        System.out.println("Searching for element 10...");
        System.out.println("Found element 10 at position -> " + stack.search(10));
        System.out.println("Searching for element 50...");
        System.out.println("Found element 50 at position -> " + stack.search(50));
    }
}
