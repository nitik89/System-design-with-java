package bridgePattern;

public class LandBreath implements BreathImplementor {
    @Override
    public void breathe(){
        System.out.println("Land breaths through the ground");
    }
   
}
