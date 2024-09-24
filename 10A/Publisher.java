package a;

public class Publisher implements Runnable {
    private final MessageQueue messageQueue;
    private final String[] messages = {"Message 1", "Message 2", "Message 3", "Message 4", "Message 5"};
    private final int MAX_MESSAGES = messages.length;

    public Publisher(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
        System.out.println("Publisher created.");
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < MAX_MESSAGES; i++) {
                System.out.println("Publisher generating message: " + messages[i]);
                messageQueue.enqueueMessage(messages[i]);
                Thread.sleep(500);  
            }
            System.out.println("Publisher finished sending messages.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
