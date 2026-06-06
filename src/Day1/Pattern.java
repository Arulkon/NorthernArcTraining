package Day1;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n value of the patterns: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid....");
        }
        else{
            pattern1(n);
            pattern2(n);
            pattern3(n);
            pattern4(n);
            pattern5(n);
            pattern6(n);
            pattern7(n);
            pattern8(n);
        }
    }
    public static void pattern1(int n){
        System.out.println();
        System.out.println("Pattern1:");
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    public static void pattern2(int n){
        System.out.println();
        System.out.println("Pattern2:");
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    public static void pattern3(int n){
        System.out.println("Pattern3:");
        System.out.println();
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    public static void pattern4(int n){
        System.out.println("Pattern4:");
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    public static void pattern5(int n){
        System.out.println("Pattern5:");
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    public static void pattern6(int n){
        System.out.println("Pattern6:");
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else if(j==1 || j==2*i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
    public static void pattern7(int n){
        System.out.println("Pattern7:");
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(stars>n){
                stars=2*n-i;
            }
            System.out.println();
            for(int j=1;j<=n-stars;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*stars-1;j++){
                if(j==1 || j==2*stars-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
    public static void pattern8(int n){
        System.out.println("Pattern8:");
        for(int i=1;i<=n;i++){
            System.out.println();
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else if(j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
}
