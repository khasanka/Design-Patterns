package CreationalPatterns.C_AbstractFactory;

public class ProductBImplOne implements ProductB{
    @Override
    public void useProductB() {
        System.out.println("You are using ProductB implementation 1");
    }
}
