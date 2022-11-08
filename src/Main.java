import button.command.AlarmCommand;
import button.command.LampOffCommand;
import button.command.LampOnCommand;
import button.invoker.Button;
import button.receiver.Alarm;
import streetFighter.command.blanca.BlancaComboCommand;
import streetFighter.command.blanca.BlancaSpecialCommand;
import streetFighter.command.wiliam.WiliamAttackCommand;
import streetFighter.command.wiliam.WiliamSpecialCommand;
import streetFighter.invoker.LeftButton;
import streetFighter.invoker.RightButton;

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
        /** button -> command -> character **/
        streetFighter.invoker.Button leftButton = new LeftButton(new BlancaSpecialCommand());
        leftButton.press();
        streetFighter.invoker.Button rightButton = new RightButton(new BlancaComboCommand());
        rightButton.press();

        leftButton = new LeftButton(new WiliamAttackCommand());
        leftButton.press();
        rightButton = new RightButton(new WiliamSpecialCommand());
        rightButton.press();

        /**
         * 첫번째 시도.--------------------------------------
         * interface Command
         * -> implements
         * abstract class BlancaCommand
         * -> extends
         * class BlancaSpecialCommand
         * 일때 타입 형변환은 BlancaComboCommand -> BlancaCommand 밖에 안된다.
         *
         * 두번째 시도.--------------------------------------
         * interface Command
         * -> extends
         * interface BlancaCommand
         * -> implements
         * class BlancaSpecialCommand
         *
         * 세번째 시도. 다중 상속 이용. ---------------------------------
         * interface Command, interface BlancaCommand
         * -> implements
         * class BlancaSpecialCommand
         * **/

    }
}