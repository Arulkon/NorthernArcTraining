package Module01.Day2.Inheritance;

public class Lion extends Animal{
    @Override
    public void eats(){
        System.out.println("Lion is carnivorous");
    }
    @Override
    public void shouts(){
        System.out.println("Lion is roaring");
    }
    public void special(){
        System.out.println("Lion is ruling the jungle");
    }
}
