interface RemoteControl {
    void turnOn();
    void turnOff();
}

abstract class Appliance {
    abstract void displayAppliance();
}

class SmartTV extends Appliance implements RemoteControl {

    public void displayAppliance() {
        System.out.println("Appliance: Smart TV");
    }

    public void turnOn() {
        System.out.println("Smart TV is ON");

    }

    public void turnOff() {
        System.out.println("Smart TV is OFF");
    }
}

public class Experiment6 {
    public static void main(String[] args) {

        Appliance a = new SmartTV();

        a.displayAppliance();

        SmartTV tv = (SmartTV) a;
        tv.turnOn();
        tv.turnOff();
    }
}