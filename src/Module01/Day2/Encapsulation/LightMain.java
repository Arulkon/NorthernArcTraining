package Module01.Day2.Encapsulation;

public class LightMain {
    public static void main(String[] args) {
        Light l=new Light("Philips",60);
        l.turnOn();
        l.turnOff();
        l.getDetails();
    }
}
