package Module01.Day2.Abstraction;

public class wpmsg implements Message{
    public void send(String msg) {
        System.out.println(" Sending the whatsapp message: " + msg);
    }
}
