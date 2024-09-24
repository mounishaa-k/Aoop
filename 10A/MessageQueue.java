package a;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueue {
    private final Queue<String> queue = new LinkedList<>();
    private final int CAPACITY = 5;  
    public synchronized void enqueueMessage(String message) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            System.out.println("Queue is full. Publisher is waiting...");
            wait();  
        }
        queue.add(message);
        System.out.println("Enqueued message: " + message);
        notifyAll();  
    }

 
    public synchronized String dequeueMessage() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Queue is empty. Subscriber is waiting...");
            wait();  
        }
        String message = queue.poll();
        System.out.println("Dequeued message: " + message);
        notifyAll(); 
        return message;
    }

 
    public synchronized boolean isQueueEmpty() {
        return queue.isEmpty();
    }
}
