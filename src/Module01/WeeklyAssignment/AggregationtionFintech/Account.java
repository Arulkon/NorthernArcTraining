package Module01.WeeklyAssignment.AggregationtionFintech;

public class Account {
    private Customer c;
    private double balance;
    public Account(Customer c, double balance){
        this.c= c;
        this.balance =balance;
    }
    public void getDetails(){
        System.out.println("The customer " + c+" has account "+ balance);
    }
    public String toString(){
        return "Account Holder: "+c+", Balance: "+balance;
    }
}
