package a;

public class Main {
    public static void main(String[] args) {
   
        MessageQueue queue = new MessageQueue();

        Thread publisherThread = new Thread(new Publisher(queue));
        Thread subscriberThread = new Thread(new Subscriber(queue));


        publisherThread.start();
        subscriberThread.start();
        try {
            publisherThread.join();
            subscriberThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Message queue system completed.");
    }
}

