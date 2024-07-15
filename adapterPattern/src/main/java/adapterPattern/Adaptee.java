package adapterPattern;

public class Adaptee implements AdapteeInterface {
    @Override  // Implementing the method from the AdapteeInterface
    public double getWeight(){
        return 50;
    }
    
}
