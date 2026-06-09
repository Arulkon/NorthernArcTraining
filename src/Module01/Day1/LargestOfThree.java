package Module01.Day1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unique integer values for a,b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        findLargest(a,b,c);
    }
    public static void findLargest(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println("a is the largest");
            }
            else{
                System.out.println("c is the largest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is the greatest");
            }
            else{
                System.out.println("c is the greatest");
            }
        }
    }
}
