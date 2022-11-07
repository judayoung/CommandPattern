package button.command;

import button.receiver.Lamp;

public class LampOnCommand implements Command{

    private Lamp lamp = new Lamp();

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
