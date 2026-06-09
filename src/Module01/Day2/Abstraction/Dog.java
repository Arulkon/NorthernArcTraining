package Module01.Day2.Abstraction;



public class Dog extends Animal implements PetAnimal {
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

    @Override
    public void giveTreat() {
        System.out.println("Dog is eating treat");
    }

    @Override
    public void giveScratches() {
        System.out.println("Dog likes the scratches");
    }

}
