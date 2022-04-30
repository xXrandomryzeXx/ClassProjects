package IADS_Work.Theme19;

import java.util.Arrays;
import java.util.Stack;

public class ArrayToStack {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        System.out.println("Array elements: " + Arrays.toString(array));
        System.out.println("Converting Array to Stack using a loop...");
        for(int element : array){
            stack.push(element);
        }
        System.out.println("Stack elements: " + stack);
    }
}