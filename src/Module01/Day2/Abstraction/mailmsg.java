package Module01.Day2.Abstraction;

public class mailmsg implements Message {
    public void send(String msg) {
        System.out.println(" Sending the mail message: " + msg);
    }
}
