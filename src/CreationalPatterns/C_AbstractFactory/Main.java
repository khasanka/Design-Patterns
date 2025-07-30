package CreationalPatterns.C_AbstractFactory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new FactoryTwo();
        Application app = new Application(factory);

        app.useProducts();
    }
}
