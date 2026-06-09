package Module01.Day2.Inheritance;

public class Dog extends Animal{
    @Override
    public void eats(){
        System.out.println("Dog is omnivorous");
    }
    @Override
    public void shouts(){
        System.out.println("Dog is barking");
    }
    public void special(){
        System.out.println("Dog is gaurding the house");
    }
}
