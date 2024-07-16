package flyweightPattern;

public class DogRobot implements RobotIn {

    @Override
    public void display(String name) {
        System.out.println("Dog robot: " + name);
    }
    
}
