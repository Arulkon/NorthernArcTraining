package Module01.Day2.Abstraction;


import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter animal 1-Dog,2-Deer,3-Lion:");
        int num=sc.nextInt();
        Animal a2;
        switch (num) {
            case 1:
                Dog d=new Dog();
                d.eats();
                d.shouts();
                d.special();
                d.giveTreat();
                d.giveScratches();
                break;
            case 2:
                Deer de=new Deer();
                de.eats();
                de.shouts();
                de.special();
                break;
            case 3:
                Lion l=new Lion();
                l.eats();
                l.shouts();
                l.special();
                break;
            default:
                System.out.println("Invalid Option");
        }

    }
}
