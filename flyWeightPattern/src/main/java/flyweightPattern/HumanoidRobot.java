package flyweightPattern;

public class HumanoidRobot implements RobotIn  {

    @Override
    public void display(String name) {
        System.out.println("Humanoid robot: " + name);
    }
    
}
