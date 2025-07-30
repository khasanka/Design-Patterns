package CreationalPatterns.C_AbstractFactory;

public class FactoryTwo implements Factory{
    @Override
    public ProductA getProductA() {
        return new ProductAImplTwo();
    }

    @Override
    public ProductB getProductB() {
        return new ProductBImplTwo();
    }
}
