package factoryPattern;

public class Circle implements ShapeIn{
    @Override  // required method from ShapeIn interface
    public void draw(){
        System.out.println("Circle is drawn.");
    }
    
}
