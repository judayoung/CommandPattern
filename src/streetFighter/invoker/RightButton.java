package streetFighter.invoker;

import streetFighter.command.Command;

public class RightButton implements Button{

    private Command command;

    public RightButton(Command command) {
        this.command = command;
    }

    @Override
    public void press() {
        command.execute();
    }

}
