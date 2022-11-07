package button.invoker;

import button.command.Command;

public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void press() {
        System.out.println(this.getClass().getSimpleName() + " : " + command.getClass().getSimpleName());
        System.out.print("------> ");
        command.execute();
    }
}
