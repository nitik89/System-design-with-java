package adapterPattern;

public class Adapter implements AdapterInterface {
AdapteeInterface adapteeInterface;

     Adapter(AdapteeInterface adapteeInterface) {
         this.adapteeInterface = adapteeInterface;
 
    }   
    @Override
    public double convertWeight() {
        double weightInPounds = adapteeInterface.getWeight();
        return  (weightInPounds * 2.20462);  // Convert kilograms to pounds
    }
   
    
}
