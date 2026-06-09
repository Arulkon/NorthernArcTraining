package Module01.WeeklyAssignment.CompositionFintech;

public class ChequeBook {
    private int noOfCheques;

    public ChequeBook(int noOfCheques) {
        this.noOfCheques = noOfCheques;
    }

    @Override
    public String toString() {
        return String.valueOf(noOfCheques);
    }
}
