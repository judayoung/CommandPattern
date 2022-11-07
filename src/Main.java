import button.command.AlarmCommand;
import button.command.Command;
import button.command.LampOffCommand;
import button.command.LampOnCommand;
import button.invoker.Button;
import button.receiver.Alarm;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Let's use Command Pattern.\n");

        System.out.println("First example is button press.");
        Button button = new Button(new LampOnCommand());
        button.press();
        button.press();

        button = new Button(new LampOffCommand());
        button.press();
        button.press();

        System.out.println();
        AlarmCommand alarmCommand = new AlarmCommand();
        button = new Button(alarmCommand);
        button.press();

        alarmCommand = new AlarmCommand(new Alarm(10));
        button = new Button(alarmCommand);
        button.press();

        alarmCommand.alarm.setHour(18);
        button = new Button(alarmCommand);
        button.press();


        System.out.println("\nSecond example is STREET FIGHTER!");


    }
}