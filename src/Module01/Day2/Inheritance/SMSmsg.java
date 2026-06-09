package Module01.Day2.Inheritance;

public class SMSmsg extends Message{
    public void send(String msg) {
        System.out.println(" Sending the SMS message: " + msg);
    }
}
