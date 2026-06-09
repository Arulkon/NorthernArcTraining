package Module01.WeeklyAssignment.InheritanceFintech;

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

}
