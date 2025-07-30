package CreationalPatterns.C_AbstractFactory;

public class FactoryOne implements Factory{
    @Override
    public ProductA getProductA() {
        return new ProductAImplOne() {
        };
    }

    @Override
    public ProductB getProductB() {
        return new ProductBImplOne();
    }
}
