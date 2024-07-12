package observer;

public class Main {
    public static void main(String[] args) {
        Weather weatherObserver=new Weather();
        Mobile mobileUser1=new Mobile();
        Mobile mobileUser2=new Mobile();
        Screen screenUser1=new Screen();
        weatherObserver.add(mobileUser1);
        weatherObserver.add(mobileUser2);
        weatherObserver.add(screenUser1);
        
        weatherObserver.setData(100);
    }
}
