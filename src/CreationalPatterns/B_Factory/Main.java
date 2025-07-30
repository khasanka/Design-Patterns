package CreationalPatterns.B_Factory;

import CreationalPatterns.B_Factory.Factory.ShapeFactory;
import CreationalPatterns.B_Factory.ProductInterface.Shape;

public class Main {

    public static void main(String[] args) {


        // -------- Client Code -------------
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}
