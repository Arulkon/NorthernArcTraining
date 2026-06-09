package Module01.Day2.Abstraction;

import Module01.Day2.Inheritance.Animal;

public class Deer extends Animal {
    @Override
    public void eats(){
        System.out.println("Deer is herbivorous");
    }
    @Override
    public void shouts(){
        System.out.println("Deer is bleating");
    }
    public void special(){
        System.out.println("Deer is running very fast");
    }
}
