package Module01.Day1;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks to be graded");
        int m=sc.nextInt();
        marks(m);

    }
    public static void marks(int m){
        if(m<0 || m>100){
            System.out.println("Invalid marks");
        }
        else if(m>90){
            System.out.println("O Grade");
        }
        else if(m>80){
            System.out.println("A+ Grade");
        }
        else if(m>70){
            System.out.println("A Grade");
        }
        else if(m>60){
            System.out.println("B+ Grade");
        }
        else if(m>50){
            System.out.println("B Grade");
        }
        else if(m>40){
            System.out.println("C Grade");
        }
        else{
            System.out.println("Fail");
        }
    }
}
