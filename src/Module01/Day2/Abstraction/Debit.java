package Module01.Day2.Abstraction;

public class Debit implements Payment{
    public void pay(double amt){
        System.out.println("The amount "+amt+" is payed through Debiit card");
    }
}
