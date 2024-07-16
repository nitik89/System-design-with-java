package bridgePattern;

public abstract class LivingThings {
     BreathImplementor breathImplementor;

    public LivingThings(BreathImplementor breathImplementor) {
        this.breathImplementor = breathImplementor;
    }

    abstract public void breathProcess();
}

