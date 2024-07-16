package flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory  {
   private static Map<String,RobotIn> robots = new HashMap<>();
    public static RobotIn createRobot(String robotType){
        if(robots.containsKey(robotType)){
            return robots.get(robotType);
        }
        else {
            if(robotType=="Humanoid"){
               //create a new robot object and put it in the hashmap
               RobotIn robot = new HumanoidRobot();
               robots.put(robotType, robot);
               return robot;
            }
            else if(robotType=="Dog"){
               RobotIn robot = new DogRobot();
               robots.put(robotType, robot);
               return robot;
            }
            
        }
        return null;
    }

}
