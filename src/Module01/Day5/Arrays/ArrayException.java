package Module01.Day5.Arrays;

import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.next();
        System.out.println("Enter your password: ");
        String pass=sc.next();
        String arr[]={"Nikaash","Arulkon"};
        try {
            boolean bl=false;
            for(String val:arr){
                if(name.equalsIgnoreCase(val)){
                    bl=true;
                }
            }
            if(!bl){
                throw new InvalidException("Invalid Name...");
            }
            else{
                System.out.println("Welcome to the party");
            }
        }
        catch(InvalidException e){
            System.out.println("You are not allowed!!!"+e);
        }
    }
}
