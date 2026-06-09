package Module01.Day2.Abstraction;

import java.util.Scanner;

public class MessageMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-wp,2-email,3-SMS: ");
        int opt=sc.nextInt();
        System.out.println("Enter the message to be sent");
        sc.nextLine();
        String msg=sc.nextLine();
        switch(opt){
            case 1:
                wpmsg m=  new wpmsg();
                m.send(msg);
                break;
            case 2:
                mailmsg s=new mailmsg();
                s.send(msg);
                break;
            case 3:
                SMSmsg n=new SMSmsg();
                n.send(msg);
                break;
        }
    }
}
