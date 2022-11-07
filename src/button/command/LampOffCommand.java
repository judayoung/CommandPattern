package button.command;

import button.receiver.Lamp;

public class LampOffCommand implements Command{
    private Lamp lamp = new Lamp();

    @Override
    public void execute() {
        lamp.turnOff();
    }
}
