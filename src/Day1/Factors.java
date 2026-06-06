package Day1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int m = sc.nextInt();
        findFactor(m);
    }
    public static void findFactor(int m){
        int count = 0;
        int sum = 0;
        System.out.println("The factors of the number are:");
        for(int i=1;i*i<=m;i++){
            if(m/i==i){
                System.out.println(i);
                count++;
                sum+=i;
            }
            else if(m%i==0){
                System.out.println(i);
                System.out.println(m/i);
                count+=2;
                sum+=i+m/i;
            }
        }
        System.out.println("The count of factors are "+count+" and their sum is "+sum);
    }
}
