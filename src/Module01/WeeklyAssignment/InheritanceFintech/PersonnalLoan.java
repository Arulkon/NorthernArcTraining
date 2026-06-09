package Module01.WeeklyAssignment.InheritanceFintech;

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
}
