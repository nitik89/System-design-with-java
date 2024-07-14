package mediatorPattern;

public class Main {
    public static void main(String[] args) {
       Auction auction= new Auction();
       Colleague bidder1=new Bidder("Abc",auction);
       Colleague bidder2=new Bidder("XYZ",auction);
       bidder1.placeBid(300);
       bidder2.placeBid(400);
    }
}
