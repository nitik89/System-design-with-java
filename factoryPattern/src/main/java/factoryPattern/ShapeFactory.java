package factoryPattern;

public class ShapeFactory {
    public ShapeIn getShape(String shapeType) {
        switch(shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
