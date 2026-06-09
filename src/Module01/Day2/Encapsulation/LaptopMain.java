package Module01.Day2.Encapsulation;

public class LaptopMain {
    public static void main(String[] args) {
        Laptop l=new Laptop("Lenova","Notepad","Intel 7",16,256);
        l.turnOn();
        l.turnOff();
        l.getDetails();
    }
}
