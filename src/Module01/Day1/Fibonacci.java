package Module01.Day1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in fibonacci:");
        int n = sc.nextInt();
        printFibonacci(n);
    }
    public static void printFibonacci(int n){
        int i=1;
        int j=1;
        System.out.println("The Series is:");
        System.out.println(i);
        System.out.println(j);
        for(int k=3;k<=n;k++){
            System.out.println(i+j);
            int temp = i;
            i= i+j;
            j = temp;
        }
    }
}
