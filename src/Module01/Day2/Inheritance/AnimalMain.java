package Module01.Day2.Inheritance;

import java.util.Scanner;

public class AnimalMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter animal 1-Dog,2-Deer,3-Lion:");
        int num=sc.nextInt();
        Animal a2;
        switch (num) {
            case 1:
                a2 =new Dog();
                ((Dog)(a2)).special();
                break;
            case 2:
                a2 =new Deer();
                ((Deer)(a2)).special();
                break;
            case 3:
                a2 =new Lion();
                ((Lion)(a2)).special();
                break;
            default:
                return;
        }
        a2.shouts();
        a2.eats();
    }
}
