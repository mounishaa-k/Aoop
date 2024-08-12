package AuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> bidders;

    public Auction() {
        bidders = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        bidders.add(observer);
        System.out.println("Bidder registered for auction updates.");
    }

    @Override
    public void removeObserver(Observer observer) {
        bidders.remove(observer);
        System.out.println("Bidder unsubscribed from auction updates.");
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer bidder : bidders) {
            bidder.update(event);
        }
        System.out.println("All bidders notified about event: " + event);
    }

    public void startAuction() {
        System.out.println("Auction has started.");
        notifyObservers("Auction has started");
    }

    public void endAuction() {
        System.out.println("Auction has ended.");
        notifyObservers("Auction has ended");
    }

    public void itemAvailable(String item) {
        System.out.println("New item available for bidding: " + item);
        notifyObservers("Item available: " + item);
    }
}
