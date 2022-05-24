package IADS_Work.Theme20;
import java.lang.reflect.Array;
import java.util.Arrays;

class Queue{
    // Indexes in the array
    private int back;
    private int capacity;
    private int[] elements;

    public Queue(int size){
        capacity = size;
        elements = new int[capacity];
        back = 0;
    }

    public void qAdd(int element){
        if(back >= capacity){
            System.out.println("Error: Queue is full");
        }else{
            elements[back] = element;
            back++;
        }
    }

    public int qPeek(){
        return elements[0];
    }
    // Take first element
    public int qPoll(){
        int firstValue = elements[0]; // Take first element in queue/array/

        //Move all elements back by 1 index
        for(int i = 1; i < back; i++){
            elements[i-1] = elements[i];
            elements[i] = 0; //Set element to 0, because why not?
        }
        back--; // Move back by 1 because the whole queue got moved
        return firstValue;
    }

    public int qSize(){
        return capacity;
    }

    public boolean qIsEmpty(){
        return back == 0;
    }

    public void qPrint(){
        System.out.print("[");
        for(int i = 0; i < back; i++){
            System.out.print(elements[i] + ((i == back-1 || i == elements.length - 1)? "":", "));
        }
        System.out.print("]\n");
    }

}

public class QueueArrayImplementation {
    public static void main(String[] args){
        Queue queue = new Queue(5);
        System.out.println("Queue is Empty -> " + queue.qIsEmpty());
        queue.qAdd(1);
        queue.qPrint();
        queue.qAdd(2);
        queue.qPrint();
        queue.qAdd(3);
        queue.qPrint();
        queue.qAdd(4);
        queue.qPrint();
        queue.qAdd(5);
        queue.qPrint();
        queue.qAdd(6); // This element wont be added because the queue is full
        System.out.println("We tried adding six elements, and the array only had " + queue.qSize() + " spaces");
        System.out.println("Queue is Empty -> " + queue.qIsEmpty());

        System.out.println("First element in Queue: " + queue.qPoll());
        queue.qPrint();
        System.out.println("First element in Queue: " + queue.qPoll());
        queue.qPrint();
        System.out.println("First element in Queue: " + queue.qPoll());
        queue.qPrint();
        System.out.println("We can try adding six now.");
        queue.qAdd(6);
        queue.qPrint();
    }
}