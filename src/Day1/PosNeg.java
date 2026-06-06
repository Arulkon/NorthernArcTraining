package Day1;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int a = sc.nextInt();
        posNeg(a);
    }
    public static void posNeg(int a){
        if(a==0){
            System.out.println("a is neither positive nor negative.a is zero");
        }
        else if(a>0){
            System.out.println("a is positive");
        }
        else {
            System.out.println("a is negative");
        }
    }
}
