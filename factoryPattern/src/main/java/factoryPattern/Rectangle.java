package factoryPattern;

public class Rectangle implements ShapeIn{
    @Override  // required method from ShapeIn interface
    public void draw(){
        System.out.println("Rectangle is drawn.");
    }
    
}
