package b;

public class Producer implements Runnable {
    private final BoundedBuffer buffer;
    private final int MAX_ITEMS = 20;  
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (value < MAX_ITEMS) {
                buffer.produce(value++);
                Thread.sleep(500);  
            }
            System.out.println("Producer finished producing.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

