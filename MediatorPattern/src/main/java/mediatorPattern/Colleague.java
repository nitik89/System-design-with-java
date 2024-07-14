package mediatorPattern;

public interface Colleague {
    void placeBid(int bidAmount);
    void recieveBidNotification(int bidAmount);
    String getName();
}
