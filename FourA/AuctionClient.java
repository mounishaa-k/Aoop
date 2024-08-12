package AuctionSystem;

public class AuctionClient {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);

        auction.itemAvailable("Antique Vase");
        auction.startAuction();
        auction.endAuction();

        auction.removeObserver(bidder1);

        
        auction.itemAvailable("Vintage Car");
    }
}
