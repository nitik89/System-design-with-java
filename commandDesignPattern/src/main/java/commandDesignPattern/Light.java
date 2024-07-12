package commandDesignPattern;

public class Light {
    private boolean isOn=false;
    public void turnOn(){
        isOn=true;
        System.out.println("light is ON");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("light is Off");
    }
}
