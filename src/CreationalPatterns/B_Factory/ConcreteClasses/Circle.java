package CreationalPatterns.B_Factory.ConcreteClasses;

import CreationalPatterns.B_Factory.ProductInterface.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle...");
    }
}
