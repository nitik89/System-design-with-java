package adapterPattern;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);

        System.out.println("Weight in pounds: " + adapter.convertWeight());  // Output: Weight in pounds: 110.231
    }
}
