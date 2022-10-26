/* Current file: ArrayListToStack.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme19;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayListToStack {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(300);
        list.add(4000);
        System.out.println("List: " + list);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Converting List to Stack using .addAll()...");
        stack.addAll(list);
        System.out.println("Elements in Stack: " + stack);

        System.out.println("Clearing stack...");
        stack.clear();
        System.out.println("List: " + list);
        System.out.println("Converting List to Stack using a loop...");
        for(int num : list){
            stack.push(num);
        }
        System.out.println("Elements in Stack: " + stack);
    }
}
