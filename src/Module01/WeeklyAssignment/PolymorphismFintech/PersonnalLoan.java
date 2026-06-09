package Module01.WeeklyAssignment.PolymorphismFintech;

public class PersonnalLoan extends Loan{

    private String purpose;
    public PersonnalLoan(String loanId,double outstandingAmount,double interestRate,String purpose){
        super(loanId, outstandingAmount,interestRate);
        setPurpose(purpose);
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public void makePayment(double amt){
        if(amt<=0 || super.getOutstandingAmount()<amt ){
            System.out.println("Invalid Payment for Personnal Loan.....");
        }
        else{
            super.setOutstandingAmount(super.getOutstandingAmount()-amt);
            System.out.println("The available outstanding amount for the Personnal Loan is :"+super.getOutstandingAmount());
        }
    }
    @Override
    public void calculateMonthInterest(){
        System.out.println("The Personnal Loan monthly interest for this month is: "+super.getOutstandingAmount()*(super.getInterestRate()/1200));
    }
    public void makePayment(double amt,double penality){
        System.out.println("The Personnal loan penality paid is "+penality);
        makePayment(amt);
    }
}
