package bridgePattern;

public class Dog extends LivingThings {
    public Dog(BreathImplementor implementor) { 
     super(implementor);
    }
    @Override
    public void breathProcess() {
        breathImplementor.breathe();
        System.out.println("Dog barks");
    }
}
