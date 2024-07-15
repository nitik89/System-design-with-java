package facadePattern;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        String result = facade.performOperations();
        System.out.println(result);
    }
    
}
