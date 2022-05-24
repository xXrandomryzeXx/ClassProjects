package IADS_Work.Theme20;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Adding elements to the queue");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue elements: " + queue.toString());
        System.out.println("Peeking at the first element: " + queue.peek());
        System.out.println("Peeking at the first element with element(): " + queue.element());
        System.out.println("Queue is unchanged: " + queue.toString());
        System.out.println("Taking first element from the queue: " + queue.remove());
        System.out.println("Queue is changed: " + queue.toString());
        System.out.println("Taking first element from the queue using poll(): " + queue.poll());
        System.out.println("Queue is changed: " + queue.toString());
        System.out.println("Adding elements to the queue");
        queue.add(40);
        queue.add(50);
        queue.add(60);
        System.out.println("Queue elements: " + queue.toString());
        System.out.println("Size of queue is : " + queue.size());
    }
}