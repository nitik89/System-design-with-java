package commandDesignPattern;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        command off=new OffCommand(light);
        command on=new OnCommand(light);
       Remote rm=new Remote();
       rm.setCommand(on);
       rm.pressButton();
       rm.setCommand(off);
       rm.pressButton();
    }
}
