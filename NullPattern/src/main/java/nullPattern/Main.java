package nullPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory veh=Vehicle.getObject("Bike");
       System.out.println(veh.getName());
    }
}
