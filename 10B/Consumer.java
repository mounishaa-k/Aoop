package b;

public class Consumer implements Runnable {
    private final BoundedBuffer buffer;
    private final int MAX_ITEMS = 20;  

    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int count = 0;
        try {
            while (count < MAX_ITEMS) {
                buffer.consume();
                count++;
                Thread.sleep(1000);  
            }
            System.out.println("Consumer finished consuming.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


