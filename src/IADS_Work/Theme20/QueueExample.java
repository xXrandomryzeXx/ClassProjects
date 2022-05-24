package IADS_Work.Theme20;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        System.out.println("Elements in the queue: " + queue.toString());
    }
}