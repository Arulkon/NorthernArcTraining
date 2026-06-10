package Module01.Day3.Strings;

import java.util.Scanner;

public class VowelMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        String ref="aeiou";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(ref.indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        System.out.println("The no of vowels are: "+ count);
    }
}
