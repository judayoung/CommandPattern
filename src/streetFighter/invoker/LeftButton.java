package streetFighter.invoker;

import streetFighter.command.Command;

public class LeftButton implements Button{

    private Command command;

    public LeftButton(Command command) {
        this.command = command;
    }

    @Override
    public void press() {
        command.execute();
    }

}
