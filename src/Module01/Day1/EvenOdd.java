package Module01.Day1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value:");
        int c = sc.nextInt();
        evenOrOdd(c);
    }
    public static void evenOrOdd(int c){
        if (c % 2 == 0) {
            System.out.println("It is a even number.");
        } else {
            System.out.println("It is a odd number.");
        }
    }
}
