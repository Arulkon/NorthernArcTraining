package Module01.WeeklyAssignment.AssociationFintech;

public class AssociationMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Nikaash");
        Bank bank = new Bank("ABC Bank");

        bank.serveCustomer(customer);
    }
}
