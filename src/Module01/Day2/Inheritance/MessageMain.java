package Module01.Day2.Inheritance;

import java.util.Scanner;

public class MessageMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-wp,2-email,3-SMS: ");
        int opt=sc.nextInt();
        System.out.println("Enter the message to be sent");
        sc.nextLine();
        String msg=sc.nextLine();
        Message m=new Message();
        switch(opt){
            case 1:
                m=  new wpmsg();
                break;
            case 2:
                m=new mailmsg();
                break;
            case 3:
                m=new SMSmsg();
                break;
        }
        m.send(msg);
    }
}
