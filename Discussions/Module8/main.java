import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < 50; i+= 5) queue.add(i);
        System.out.println("Elements in the queue: " + queue);
        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Element at the front of the queue: " + queue.peek());
        System.out.println("Adding 55 to the queue: " + queue.add(55));
        System.out.println("Removing the element at the front of the queue: " + queue.remove());
        System.out.println("Elements in the queue: " + queue);
    }
}