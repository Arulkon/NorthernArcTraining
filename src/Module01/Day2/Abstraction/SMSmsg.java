package Module01.Day2.Abstraction;

public class SMSmsg implements Message{
    public void send(String msg) {
        System.out.println(" Sending the SMS message: " + msg);
    }
}
