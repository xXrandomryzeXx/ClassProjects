/* Current file: StackToArray.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme19;

import java.util.Arrays;
import java.util.Stack;

public class StackToArray {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        int[] array = new int[stack.size()];
        System.out.println("Stack elements: " + stack);
        System.out.println("Converting Stack to Array using a loop...");
        for(int i = array.length-1; i >= 0; i--){
            array[i] = stack.pop();
        }
        System.out.println("Array elements: " + Arrays.toString(array));
    }
}
