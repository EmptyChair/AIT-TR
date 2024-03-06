package lesson_036_JavaFramework3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class L36 {
    public static void main(String[] args) {


        System.out.println("Exploring queue");
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Banana");
        queue.offer("Orange");
        System.out.println("View the queue "+queue);
        //Remove and provide first element ("Apple")
        System.out.println(queue.poll());
        System.out.println("View the queue "+queue);
        //looking at the new first element (without removal)
        System.out.println(queue.peek());
        System.out.println("View the queue "+queue);
        //remove
        System.out.println(queue.remove());
        System.out.println("View the queue "+queue);
        //remove (the last element)
        System.out.println(queue.remove());
        System.out.println("View the queue "+queue);
        //size
        System.out.println("Queue size "+queue.size());
        System.out.println("View the queue "+queue);






    }
}
