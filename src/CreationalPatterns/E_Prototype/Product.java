package CreationalPatterns.E_Prototype;

public class Product implements Cloneable {

    String para1;
    int para2;
    double para3;

    public Product(String para1, int para2, double para3) {
        this.para1 = para1;
        this.para2 = para2;
        this.para3 = para3;
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {

        // Default Shallow Copy
        Product clone =  (Product) super.clone();

        // Deep Clone : Modify nested objects
        clone.para1 = null;

        return clone;
    }


}
