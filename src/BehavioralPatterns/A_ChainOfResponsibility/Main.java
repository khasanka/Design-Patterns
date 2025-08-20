package BehavioralPatterns.A_ChainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Info info = new Info();
        Warning warning = new Warning();
        Error error = new Error();

        info.setNext(warning);
        warning.setNext(error);

        info.HandleRequest("error");
        info.HandleRequest("info");


    }
}
