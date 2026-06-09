package Module01.WeeklyAssignment.EncapsulationFintech;

import java.util.Scanner;

public class LoanMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Loan l=new Loan("001",100000,12);
        System.out.println("Enter 1-View Outstanding amount, 2-Pay payment, 3-Calculate monthly interest,4-exit: ");
        int opt= sc.nextInt();
        while(opt!=4){
            switch(opt){
                case 1:
                    System.out.println("The available outstanding amount is :"+l.getOutstandingAmount());
                    break;
                case 2:
                    System.out.println("Enter the amount to be payed: ");
                    l.makePayment(sc.nextDouble());
                    break;
                case 3:
                    l.calculateMonthInterest();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println("Enter 1-View Outstanding amount, 2-Pay payment, 3-Calculate monthly interest,4-exit: ");
            opt= sc.nextInt();
        }
    }
}
