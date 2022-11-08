package streetFighter.command.blanca;

import streetFighter.command.Command;

public class BlancaAttackCommand implements BlancaCommand, Command {

    @Override
    public void execute() {
        blanca.attack();
    }

}
