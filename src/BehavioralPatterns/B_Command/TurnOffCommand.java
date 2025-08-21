package BehavioralPatterns.B_Command;

/**
 *  Concrete Command_2
 */
public class TurnOffCommand implements Command{

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
