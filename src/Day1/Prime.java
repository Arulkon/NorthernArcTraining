package Day1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Neither a prime nor a composite number.");
        }
        else if(countFactor(n)<=2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    public static int countFactor(int n){
        int count = 0;
        int sum = 0;
        for(int i=1;i*i<=n;i++){
            if(n/i==i){
                count++;
            }
            else if(n%i==0){
                count+=2;
            }
        }
        return count;
    }
}
