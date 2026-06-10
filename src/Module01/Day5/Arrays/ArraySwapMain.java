package Module01.Day5.Arrays;

import java.util.Scanner;

public class ArraySwapMain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("The values of the array are: ");
        for(int val:arr){
            System.out.println(val);
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index values to be swapped: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println("The values of the array after swapping are are: ");
        for(int val:arr){
            System.out.println(val);
        }
    }
}
