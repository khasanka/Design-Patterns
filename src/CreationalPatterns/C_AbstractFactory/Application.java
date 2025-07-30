package CreationalPatterns.C_AbstractFactory;

public class Application {

    private ProductA a;
    private ProductB b;

    public Application(Factory factory) {
        a = factory.getProductA();
        b = factory.getProductB();
    }

    public void useProducts() {
        a.useProductA();
        b.useProductB();
    }
}
