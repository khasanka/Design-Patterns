package BehavioralPatterns.A_ChainOfResponsibility;

public class Warning implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void HandleRequest(String request) {
        if("warning".equalsIgnoreCase(request)) {
            System.out.println("This is 'WARNING' level log message.");
        } else if (next != null) {
            next.HandleRequest(request);
        } else {
            System.out.println("Un-Handled Log message.");
        }
    }
}
