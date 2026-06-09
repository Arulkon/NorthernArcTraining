package Module01.Day2.Inheritance;

public class Debit extends Payment{
    public void pay(double amt){
        System.out.println("The amount "+amt+" is payed through Debit card");
    }
}
