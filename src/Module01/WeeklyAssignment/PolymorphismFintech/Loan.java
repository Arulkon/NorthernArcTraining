package Module01.WeeklyAssignment.PolymorphismFintech;

public class Loan {
    private String loanId;
    private double outstandingAmount;
    private double interestRate;
    public Loan(String loanId,double outstandingAmount,double interestRate){
        this.loanId=loanId;
        setOutstandingAmount(outstandingAmount);
        this.interestRate=interestRate;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public void setOutstandingAmount(double outstandingAmount) {
        if(outstandingAmount<0){
            System.out.println("Invalid outstandingAmount. Contact Manager...");
        }
        else {
            this.outstandingAmount = outstandingAmount;
        }
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getLoanId() {
        return loanId;
    }

    public double getOutstandingAmount() {
        return outstandingAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }
    public void makePayment(double amt){
        if(amt<=0 || outstandingAmount<amt ){
            System.out.println("Invalid Payment.....");
        }
        else{
            outstandingAmount-=amt;
            System.out.println("The available outstanding amount is :"+outstandingAmount);
        }
    }
    public void calculateMonthInterest(){
        System.out.println("The monthly interest for this month is: "+outstandingAmount*(interestRate/1200));
    }
}
