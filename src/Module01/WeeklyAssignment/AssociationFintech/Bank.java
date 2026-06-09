package Module01.WeeklyAssignment.AssociationFintech;

public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void serveCustomer(Customer customer) {
        System.out.println(
                bankName + " is serving " + customer.getName()
        );
    }
}
