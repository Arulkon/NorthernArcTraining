package Module01.Day2.Inheritance;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-UPI,2-Debit Card,3-Credit Card: ");
        int opt=sc.nextInt();
        System.out.println("Enter the amount to be sent");
        double amt=sc.nextDouble();
        Payment p =new Payment();
        switch(opt){
            case 1:
                p=  new UPI();
                break;
            case 2:
                p =new Debit();
                break;
            case 3:
                p=new Credit();
                break;
        }
        p.pay(amt);
    }
}
