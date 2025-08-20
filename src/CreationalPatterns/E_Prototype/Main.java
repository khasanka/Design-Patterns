package CreationalPatterns.E_Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Product p1 = new Product("Test Parameter", 456, 1.61);

        Product p2 = p1.clone();

        System.out.println(p1 + "\t => " + p1.para1 + ",\t" + p1.para2 + ",\t" + p1.para3);
        System.out.println(p2 + "\t => " + p2.para1 + ",\t" + p2.para2 + ",\t" + p2.para3);


    }
}
