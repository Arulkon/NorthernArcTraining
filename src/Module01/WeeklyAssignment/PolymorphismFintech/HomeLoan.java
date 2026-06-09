package Module01.WeeklyAssignment.PolymorphismFintech;

public class HomeLoan extends Loan{
    private double propertyValue;
    public HomeLoan(String loanId,double outstandingAmount,double interestRate,double propertyValue){
        super(loanId, outstandingAmount,interestRate);
        setPropertyValue(propertyValue);
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public double getPropertyValue() {
        return propertyValue;
    }
    @Override
    public void makePayment(double amt){
        if(amt<=0 || super.getOutstandingAmount()<amt ){
            System.out.println("Invalid Payment for Home Loan.....");
        }
        else{
            super.setOutstandingAmount(super.getOutstandingAmount()-amt);
            System.out.println("The available outstanding amount for the Home Loan is :"+super.getOutstandingAmount());
        }
    }
    @Override
    public void calculateMonthInterest(){
        System.out.println("The Home Loan monthly interest for this month is: "+super.getOutstandingAmount()*(super.getInterestRate()/1200));
    }
    public void makePayment(double amt,double penality){
        System.out.println("The Home loan penality paid is "+penality);
        makePayment(amt);
    }
}
