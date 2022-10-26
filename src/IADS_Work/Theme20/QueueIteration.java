/* Current file: QueueIteration.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme20;

import com.sun.security.jgss.GSSUtil;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueIteration {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue elements: " + queue.toString());
        System.out.println("Iterating through queue using Iterator");
        Iterator<Integer> iterator = queue.stream().iterator();
        while(iterator.hasNext()){
            String string = iterator.next().toString();
            System.out.print(string + " ");
        }
        System.out.println("\nQueue elements: " + queue.toString());
        System.out.println("Iterating through queue using a foreach loop");
        for(int element : queue){
            System.out.print(element + " ");
        }
        System.out.println("\nQueue remains unchanged: " + queue.toString());


    }
}
