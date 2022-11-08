package streetFighter.receiver;

public class Blanca implements Character{
    @Override
    public void attack() {
        System.out.println("Wild Pang.");
    }

    @Override
    public void attackSpecial() {
        System.out.println("Rock Crash!");
    }

    @Override
    public void attackCombo() {
        System.out.println("Electric Thunder!!!");
    }
}
