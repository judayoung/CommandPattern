package button.receiver;

public class Alarm {

    private int hour;

    public Alarm(int hour) {
        this.hour = hour;
    }

    public void start() {
        System.out.println("Alarm : " + hour + " o'clock.");
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
