package facadePattern;

public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    public String performOperations() {
        String result1 = subsystem1.operation1();
        String result2 = subsystem2.operation2();

        return result1 + "\n" + result2;
    }
}
