package sevenB;

public class Main {

	public static void main(String[] args) {
        
        System.out.println("\nTesting with Long data type:");
        GenericPriorityQ<Long> longQueue = new GenericPriorityQ<>();
        longQueue.enqueue(100L);
        longQueue.enqueue(50L);
        longQueue.enqueue(75L);
        longQueue.displayQueue();
        longQueue.dequeue();
        longQueue.displayQueue();
    }
}
