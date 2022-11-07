package button.receiver;

public class Lamp {

    private static boolean isOn;

    public Lamp() {
        this.isOn = false;
    }


    public void turnOn(){
        if(isOn){
            System.out.println("FAIL. Lamp is already turned On.");
        }else{
            System.out.println("Lamp : turn On");
            isOn = true;
        }
    }

    public void turnOff(){
        if(!isOn){
            System.out.println("FAIL. Lamp is already turned Off.");
        }else{
            System.out.println("Lamp : turn Off");
            isOn = false;
        }
    }

}
