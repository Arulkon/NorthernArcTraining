package Module01.Day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int m=sc.nextInt();
        leapy(m);
    }
    public static void leapy(int m) {
        if (m < 0) {
            System.out.println("Invalid");
        } else if (m % 400 == 0) {
            System.out.println("Leap Year");
        } else if (m % 4 == 0 && m % 100 != 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Normal Year");
        }
    }
}
