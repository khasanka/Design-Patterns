package BehavioralPatterns.A_ChainOfResponsibility;

public class Info implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void HandleRequest(String request) {
        if("info".equalsIgnoreCase(request)) {
            System.out.println("This is 'INFO' level log message.");
        } else if (next != null) {
            next.HandleRequest(request);
        } else {
            System.out.println("Un-Handled Log message.");
        }
    }
}
