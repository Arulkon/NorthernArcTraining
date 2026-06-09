package Module01.WeeklyAssignment;

import java.util.Scanner;

public class RechargeTrackerMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RechargeTracker r=new RechargeTracker();
        System.out.println("Enter the balance and charge/min: ");
        r.setBalance(sc.nextDouble());
        r.setMinCharge(sc.nextDouble());
        System.out.println("Enter option 1-Recharge,2-Talk Phone,3-View Balance,4-Exit: ");
        int opt= sc.nextInt();
        while(opt!=4){
            switch(opt){
                case 1:
                    System.out.println("Enter the amount to be recharge: ");
                    r.setBalance(r.getBalance()+sc.nextDouble());
                    System.out.println("The available balance now is "+r.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the minutes of talking: ");
                    double duration=sc.nextDouble();
                    if(r.getBalance()<duration*r.getMinCharge()){
                        System.out.println("Insufficient Balance......");
                    }
                    else{
                        r.setBalance(r.getBalance()-duration*r.getMinCharge());
                        System.out.println("The available balance now is "+r.getBalance());
                    }
                    break;
                case 3:
                    System.out.println("The available balance now is "+r.getBalance());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid option");

            }
            System.out.println("Enter option 1-Recharge,2-Talk Phone,3-View Balance,4-Exit: ");
            opt= sc.nextInt();
        }

    }
}
