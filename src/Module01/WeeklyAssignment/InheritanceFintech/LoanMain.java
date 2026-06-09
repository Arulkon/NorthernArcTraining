package Module01.WeeklyAssignment.InheritanceFintech;

public class LoanMain {
    public static void main(String[] args) {
        Loan l1=new HomeLoan("H001",1000000,12,3000000);
        Loan l2=new PersonnalLoan("P001",300000,6,"Marriage");
        Loan l3=new VehicleLoan("V001",50000,9,"Scooter");
        l1.getDetails();
        System.out.println("The Home loan's property value is: "+((HomeLoan)l1).getPropertyValue());
        l2.getDetails();
        System.out.println("The Personnal Loan purpose is:" +((PersonnalLoan)l2).getPurpose());
        l3.getDetails();
        System.out.println("The vehicle loan type is:"+((VehicleLoan)l3).getVehicleType());
    }
}
