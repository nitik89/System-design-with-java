package bridgePattern;

public class Fish extends LivingThings {
    public Fish(BreathImplementor implementor) { 
     super(implementor);
    }
    @Override
    public void breathProcess() {
        breathImplementor.breathe();
        System.out.println("Fish swims");
    }
}
