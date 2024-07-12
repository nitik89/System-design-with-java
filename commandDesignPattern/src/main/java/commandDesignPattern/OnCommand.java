package commandDesignPattern;

public class OnCommand implements command {
    Light light;
     OnCommand(Light light) {
        this.light=light;
    }
    public void execute(){
        light.turnOff();
    }
    
}
