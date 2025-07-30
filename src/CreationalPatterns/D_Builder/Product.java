package CreationalPatterns.D_Builder;

public class Product {

    private String para1;
    private int para2;
    private double para3;

    public static class Builder{
        private String para1;
        private int para2;
        private double para3;

        public Builder(String requiredParam) {
            this.para1 = requiredParam;
        }

        public Builder para2(int para2) {
            this.para2 = para2;
            return this;
        }

        public Builder para3(double para3) {
            this.para3 = para3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    private Product(Builder builder) {
        this.para1 = builder.para1;
        this.para2 = builder.para2;
        this.para3 = builder.para3;
    }


}
