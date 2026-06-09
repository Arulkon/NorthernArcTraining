package Module01.WeeklyAssignment.CompositionFintech;


public class Account {
    private DebitCard d;
    private ChequeBook ch;
    private double balance;
    public Account(String d, int ch, double balance){
        this.d= new DebitCard(d);
        this.ch=new ChequeBook(ch);
        this.balance =balance;
    }
    public void getDetails(){
        System.out.println("The debitcard " + d+" has account "+ balance);
    }
    public String toString(){
        return "Account Holder: "+d+", Balance: "+balance+" ChequeBooks: "+ ch+"pages";
    }
}
