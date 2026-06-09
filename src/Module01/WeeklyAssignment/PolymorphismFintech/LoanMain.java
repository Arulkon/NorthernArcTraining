package Module01.WeeklyAssignment.PolymorphismFintech;

public class LoanMain {
    public static void main(String[] args) {
        Loan l1=new HomeLoan("H001",1000000,12,3000000);
        Loan l2=new PersonnalLoan("P001",300000,6,"Marriage");
        Loan l3=new VehicleLoan("V001",50000,9,"Scooter");
    }
}
