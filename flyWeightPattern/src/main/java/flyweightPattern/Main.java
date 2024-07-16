package flyweightPattern;

public class Main  {
    public static void main(String[] args) {
        RobotFactory factory = new RobotFactory();
      
        RobotIn humanoid=factory.createRobot("Humanoid");
        RobotIn dogrobot=factory.createRobot("Dog");
        humanoid.display("Rahul");
        dogrobot.display("Barky");
    }
    

}
