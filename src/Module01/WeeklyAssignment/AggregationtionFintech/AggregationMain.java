package Module01.WeeklyAssignment.AggregationtionFintech;

public class AggregationMain {
    public static void main(String[] args) {
        Customer c= new Customer("Nikaash");
        Account a=new Account(c,100);
        System.out.println(a);
    }
}
