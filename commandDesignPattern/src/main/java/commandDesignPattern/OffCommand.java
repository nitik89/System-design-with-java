package commandDesignPattern;

public class OffCommand implements command {
    Light light;
    OffCommand(Light light) {
        this.light=light;
    }
    public void execute(){
        light.turnOn();
    }
    
}
