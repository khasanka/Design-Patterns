package BehavioralPatterns.A_ChainOfResponsibility;

public class Error implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void HandleRequest(String request) {
        if("error".equalsIgnoreCase(request)) {
            System.out.println("This is 'ERROR' level log message.");
        } else if (next != null) {
            next.HandleRequest(request);
        } else {
            System.out.println("Un-Handled Log message.");
        }
    }
}
