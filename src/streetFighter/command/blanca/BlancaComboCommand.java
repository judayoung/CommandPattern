package streetFighter.command.blanca;

import streetFighter.command.Command;

public class BlancaComboCommand implements BlancaCommand, Command {

    @Override
    public void execute() {
        blanca.attackCombo();
    }

}