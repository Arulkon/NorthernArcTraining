package Module01.WeeklyAssignment.CompositionFintech;

public class DebitCard {
    private String cardNo;

    public DebitCard(String cardNumber) {
        this.cardNo = cardNumber;
    }

    public void showCardDetails() {
        System.out.println("Card Number: " + cardNo);
    }

    @Override
    public String toString() {
        return cardNo;
    }
}
