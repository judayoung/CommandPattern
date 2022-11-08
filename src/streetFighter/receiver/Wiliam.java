package streetFighter.receiver;

public class Wiliam implements Character{
    @Override
    public void attack() {
        System.out.println("Dragon Suplex.");
    }

    @Override
    public void attackSpecial() {
        System.out.println("Reverse Spin Kick!");
    }

    @Override
    public void attackCombo() {
        System.out.println("Sonic Boom!!!");
    }
}
