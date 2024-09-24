package b;

import java.util.LinkedList;
import java.util.Queue;

public class BoundedBuffer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int MAX_CAPACITY = 1;

   
    public synchronized void produce(int value) throws InterruptedException {
        while (buffer.size() == MAX_CAPACITY) {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();  
        }

        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();  
    }

    
    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();  
        }

        int value = buffer.poll();
        System.out.println("Consumed: " + value);
        notifyAll();  
        return value;
    }
}

