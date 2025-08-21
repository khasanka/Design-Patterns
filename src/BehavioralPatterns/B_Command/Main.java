package BehavioralPatterns.B_Command;

public class Main {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();

        Command on = new TurnOnCommand(light);
        Command off = new TurnOffCommand(light);

        remote.setCommand(on);
        remote.pressButton();

        remote.setCommand(off);
        remote.pressButton();

    }
}
