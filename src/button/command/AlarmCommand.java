package button.command;

import button.receiver.Alarm;

public class AlarmCommand implements Command{

    public Alarm alarm = new Alarm(7);


    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    public AlarmCommand() {
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
