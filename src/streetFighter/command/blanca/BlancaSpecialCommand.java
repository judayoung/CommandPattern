package streetFighter.command.blanca;

import streetFighter.command.Command;

public class BlancaSpecialCommand implements BlancaCommand, Command {

    @Override
    public void execute() {
        blanca.attackSpecial();
    }

}
