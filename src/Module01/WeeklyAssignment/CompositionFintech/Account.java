package Module01.WeeklyAssignment.CompositionFintech;


public class Account {
    private DebitCard d;
    private double balance;
    public Account(String d, double balance){
        this.d= new DebitCard(d);
        this.balance =balance;
    }
    public void getDetails(){
        System.out.println("The debitcard " + d+" has account "+ balance);
    }
    public String toString(){
        return "Account Holder: "+d+", Balance: "+balance;
    }
}
