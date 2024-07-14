package mediatorPattern;

public class Bidder implements Colleague {
    String name;
    AuctionMediator auctionMediator;
    Bidder(String name,AuctionMediator auctionMediator){
        this.name=name;
        this.auctionMediator=auctionMediator;
        auctionMediator.addBidder(this);
    }
    @Override
    public void placeBid(int bidAmount){
        auctionMediator.placeBid(this, bidAmount);
    }
    @Override
    public void recieveBidNotification(int bidAmount){
        System.out.println("Bidder "+name+" get the notification of bid placed"+" "+bidAmount);
    }
    @Override
    public String getName(){
        return name;
    }
}
