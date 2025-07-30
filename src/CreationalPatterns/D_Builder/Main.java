package CreationalPatterns.D_Builder;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder("RequiredParameter")
                .para2(456)
                .para3(1.61D)
                .build();

    }
}
