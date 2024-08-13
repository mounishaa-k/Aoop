package AuctionSystem;

public class AuctionClient {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Bidder bidder1 = new Bidder("Rishita");
        Bidder bidder2 = new Bidder("Sravya");

        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);

        auction.itemAvailable("Ganesh chathurdhi Laddu");
        auction.startAuction();
        auction.endAuction();

        auction.removeObserver(bidder1);

        
        auction.itemAvailable("Vintage Car");
    }
}
