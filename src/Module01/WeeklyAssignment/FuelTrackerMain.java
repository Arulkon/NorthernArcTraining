package Module01.WeeklyAssignment;

import java.util.Scanner;

public class FuelTrackerMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mileage, Maximum Fuel Capacity and current fuel capacity");
        FuelTracker f=new FuelTracker();
        f.setCurrentFuel(sc.nextDouble());
        f.setMileage(sc.nextDouble());
        f.setFuelCapacity(sc.nextDouble());
        System.out.println("Now enter the option for the services, 1-Fill Fuel, 2-Check Current Fuel, 3-Drive, 4-Stopping Vehicle,5-exit: ");
        int option=sc.nextInt();
        if(option==4){
            System.out.println("Stopping Vehicle...");
        }
        while(option!=5) {

            switch (option) {
                case 1:
                    System.out.println("Enter the fuel to be filled: ");
                    double d=sc.nextDouble();
                    if(f.getCurrentFuel()+d>f.getFuelCapacity()){
                        System.out.println("Fuel Limit Exceeds......");
                    }
                    else {
                        f.setCurrentFuel(d + f.getCurrentFuel());
                        System.out.println("The amount of fuel left is "+f.getCurrentFuel());
                    }
                    break;
                case 2:
                    System.out.println("The amount of fuel left is "+f.getCurrentFuel());
                    break;
                case 3:
                    System.out.println("Enter the KMS");
                    double kms=sc.nextDouble();
                    if(f.getCurrentFuel()-kms/f.getMileage()<0){
                        System.out.println("Insufficient Fuel......");
                    }
                    else {
                        f.setCurrentFuel(f.getCurrentFuel()-kms/f.getMileage() );
                        System.out.println("The amount of fuel left is "+f.getCurrentFuel());
                    }
                    break;
                case 4:
                    System.out.println("Stopping Vehicle...");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("Now enter the option for the services, 1-Fill Fuel, 2-Check Current Fuel, 3-Drive, 4-Stopping Vehicle,5-exit: ");
            option=sc.nextInt();
        }
    }
}
