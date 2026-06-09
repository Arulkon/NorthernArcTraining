package Module01.WeeklyAssignment;

import java.util.Scanner;

public class BankTrackerMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankTracker b=new BankTracker();
        System.out.println("Enter the existing bank balance: ");
        b.setBalance(sc.nextDouble());
        System.out.println("Enter option 1-Withdraw,2-Deposit,3-View Balance,4-Exit: ");
        int opt= sc.nextInt();
        while(opt!=4){
            switch(opt){
                case 2:
                    System.out.println("Enter the amount to be deposited: ");
                    b.setBalance(b.getBalance()+sc.nextDouble());
                    System.out.println("The available balance now is "+b.getBalance());
                    break;
                case 1:
                    System.out.println("Enter the amount to be withdrawed: ");
                    double amt=sc.nextDouble();
                    if(b.getBalance()<amt){
                        System.out.println("Insufficient Balance......");
                    }
                    else{
                        b.setBalance(b.getBalance()-amt);
                        System.out.println("The available balance now is "+b.getBalance());
                    }
                    break;
                case 3:
                    System.out.println("The available balance now is "+b.getBalance());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option");

            }
            System.out.println("Enter option 1-Withdraw,2-Deposit,3-View Balance,4-Exit: ");
            opt= sc.nextInt();
        }
    }
}
