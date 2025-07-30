package CreationalPatterns.B_Factory.Factory;

import CreationalPatterns.B_Factory.ConcreteClasses.Circle;
import CreationalPatterns.B_Factory.ConcreteClasses.Rectangle;
import CreationalPatterns.B_Factory.ConcreteClasses.Square;
import CreationalPatterns.B_Factory.ProductInterface.Shape;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
