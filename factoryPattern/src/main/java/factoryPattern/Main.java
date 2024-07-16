package factoryPattern;

public class Main {
    
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeIn shape1 = shapeFactory.getShape("circle");
        ShapeIn shape2 = shapeFactory.getShape("rectangle");

        shape1.draw();
        shape2.draw();
    }
}
