package Module01.Day3.Strings;

import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                System.out.println("Not Palindrome");
                break;
            }
            low++;
            high--;
        }
        System.out.println("Palindrome");
    }
}
