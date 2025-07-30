package CreationalPatterns.A_Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance("Data_1"));
        System.out.println(Singleton.getInstance("Data_2"));
    }
}
