package BehavioralPatterns.A_ChainOfResponsibility;

public interface Handler {
    void setNext(Handler next);
    void HandleRequest(String request);
}
