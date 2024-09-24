package a;

public class Subscriber implements Runnable {
    private final MessageQueue messageQueue;
    private final int MAX_MESSAGES_TO_CONSUME = 5;
    private int consumedMessages = 0;

    public Subscriber(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
        System.out.println("Subscriber created.");
    }

    @Override
    public void run() {
        try {
            while (consumedMessages < MAX_MESSAGES_TO_CONSUME) {
                String message = messageQueue.dequeueMessage();
                System.out.println("Subscriber consuming message: " + message);
                consumedMessages++;
                Thread.sleep(800);  
            }
            System.out.println("Subscriber finished consuming messages.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

