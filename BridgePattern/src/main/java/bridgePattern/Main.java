package bridgePattern;

public class Main {
    public static void main(String[] args) {
        BreathImplementor waterBreath=new WaterBreath();
        LivingThings fish=new Fish(waterBreath);
        fish.breathProcess();

        BreathImplementor landBreath=new LandBreath();
        LivingThings dog=new Dog(landBreath);
        dog.breathProcess();


    }
}
