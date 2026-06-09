package Module01.Day2.Inheritance;

public class Credit extends Payment{
    public void pay(double amt){
        System.out.println("The amount "+amt+" is payed through Credit card");
    }
}
