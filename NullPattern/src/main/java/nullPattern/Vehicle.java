package nullPattern;

public class Vehicle {
     
    static VehicleFactory getObject(String type){
        if("Car".equals(type)){
            return new Car();
        }
        return new Null();
    }
    
}
